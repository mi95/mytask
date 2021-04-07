package com.app.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.app.service.TaskService;
import com.common.mapper.TaskInfosCommonMapper;
import com.common.mapper.generate.*;
import com.common.pojo.PageBean;
import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import com.common.pojo.generate.*;
import com.common.utils.CommonException;
import com.common.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskInfosMapper taskInfosMapper;
    @Autowired
    TaskInfosCommonMapper taskInfosCommonMapper;
    @Autowired
    TaskStepImgMapper imgMapper;
    @Autowired
    UserTaskMapper userTaskMapper;
    @Autowired
    UserTaskImgMapper taskImgMapper;
    @Autowired
    HttpServletRequest request;
    @Autowired
    UserTaskRecordMapper taskRecordMapper;

    @Override
    public RespBean selectTaskList(ReqParam reqParam) {
        PageBean.startPage(reqParam);
        TaskInfosExample taskInfosExample = new TaskInfosExample();
        taskInfosExample.createCriteria().andStatusEqualTo(1);
        taskInfosExample.setOrderByClause("create_time desc");
        return PageBean.dataPage(taskInfosMapper.selectByExample(taskInfosExample));
    }

    @Override
    public RespBean selectTaskDetail(Integer taskId) {
        CommonException.verifyObjects(taskId);
        List<Map> taskList = taskInfosCommonMapper.selectTaskDetail(taskId);
        for(Map task : taskList){
            TaskStepImgExample imgExample = new TaskStepImgExample();
            imgExample.createCriteria().andTaskStepIdEqualTo(
                    Integer.valueOf(task.get("step_id").toString()));
            List<TaskStepImg> imgList = imgMapper.selectByExample(imgExample);
            if(!CommonException.verifyList(imgList)){
                task.put("img",imgList);
            }
        }
        return RespBean.success(taskList);
    }

    @Transactional
    @Override
    public RespBean submitUserTask(JSONObject object) {
        UserTask userTask = object.toJavaObject(UserTask.class);
        CommonException.verifyObjects(userTask.getTaskId());
        TaskInfos taskInfos = taskInfosMapper.selectByPrimaryKey(userTask.getTaskId());
        if(taskInfos == null){
            CommonException.throwNewCommonException("任务不存在");
        }
        userTask.setUserId(CommonUtils.getUserId(request));
        CommonException.resultHandler(userTaskMapper.insertSelective(userTask));
        List<String> imgList = JSONArray.parseArray(object.getString("imgList"),String.class);
        List<UserTaskImg> taskImages = new ArrayList<>();
        if(!CommonException.verifyList(imgList)){
            for(String img : imgList){
                UserTaskImg userTaskImg = new UserTaskImg();
                userTaskImg.setImgUrl(img);
                userTaskImg.setUserTaskId(userTask.getId());
                taskImages.add(userTaskImg);
            }
        }
        UserTaskRecord userTaskRecord = new UserTaskRecord();
        userTaskRecord.setUserId(CommonUtils.getUserId(request));
        userTaskRecord.setUserTaskId(userTask.getId());
        CommonException.resultHandler(taskRecordMapper.insertSelective(userTaskRecord));
        return CommonException.resultHandler(taskImgMapper.batchInsert(taskImages));
    }
}
