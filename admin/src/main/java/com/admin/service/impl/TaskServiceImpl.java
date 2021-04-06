package com.admin.service.impl;

import com.admin.pojo.TaskStepBo;
import com.admin.service.TaskService;
import com.alibaba.fastjson.JSONObject;
import com.common.mapper.TaskInfosCommonMapper;
import com.common.mapper.generate.TaskInfosMapper;
import com.common.mapper.generate.TaskStepImgMapper;
import com.common.mapper.generate.TaskStepMapper;
import com.common.pojo.PageBean;
import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import com.common.pojo.generate.*;
import com.common.utils.CommonException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskInfosMapper taskInfosMapper;
    @Autowired
    TaskInfosCommonMapper taskInfosCommonMapper;
    @Autowired
    TaskStepMapper taskStepMapper;
    @Autowired
    TaskStepImgMapper imgMapper;

    @Transactional
    public RespBean addOrUpdTask(JSONObject jsonObject) {
        TaskInfos taskInfos = jsonObject.toJavaObject(TaskInfos.class);
        List<TaskStepBo> taskStepBos = jsonObject.getJSONArray("taskStepBos").toJavaList(TaskStepBo.class);

        if(taskInfos.getId() != null){
            taskInfosMapper.updateByPrimaryKeySelective(taskInfos);

            TaskStepExample taskStepExample = new TaskStepExample();
            taskStepExample.createCriteria().andTaskIdEqualTo(taskInfos.getId());
            CommonException.resultHandler(taskStepMapper.deleteByExample(taskStepExample));

            TaskStepImgExample imgExample = new TaskStepImgExample();
            imgExample.createCriteria().andTaskIdEqualTo(taskInfos.getId());
            imgMapper.deleteByExample(imgExample);
        }else{
            CommonException.resultHandler(taskInfosMapper.insertSelective(taskInfos));
        }

        for(TaskStepBo taskStepBo : taskStepBos){
            taskStepBo.getStep().setTaskId(taskInfos.getId());
            CommonException.resultHandler(taskStepMapper.insertSelective(taskStepBo.getStep()));
            List<TaskStepImg> stepImages = new ArrayList<>();
            for(String url : taskStepBo.getImgUrls()){
                TaskStepImg taskStepImg = new TaskStepImg();
                taskStepImg.setImgUrl(url);
                taskStepImg.setTaskStepId(taskStepBo.getStep().getId());
                taskStepImg.setTaskId(taskInfos.getId());

                stepImages.add(taskStepImg);
            }
            CommonException.resultHandler(imgMapper.batchInsert(stepImages));
        }

        return RespBean.success();
    }

    @Override
    public RespBean updTask(TaskInfos taskInfos) {
        CommonException.verifyObjects(taskInfos,taskInfos.getId());
        CommonException.resultHandler(taskInfosMapper.updateByPrimaryKeySelective(taskInfos));
        return RespBean.success();
    }

    @Override
    public RespBean taskPageList(ReqParam reqParam) {
        PageBean.startPage(reqParam);
        return PageBean.dataPage(taskInfosCommonMapper.selectTaskList(reqParam));
    }

    @Override
    public RespBean taskNoPage(ReqParam reqParam) {
        return RespBean.success(taskInfosCommonMapper.selectTaskList(reqParam));
    }

    @Override
    public RespBean queryTaskDetail(Integer taskId) {
        CommonException.verifyObjects(taskId);
        TaskStepExample stepExample = new TaskStepExample();
        stepExample.createCriteria().andTaskIdEqualTo(taskId);
        List<TaskStep> taskSteps = taskStepMapper.selectByExample(stepExample);
        List<Map> data = new ArrayList<>();
        if(!CommonException.verifyList(taskSteps)){
            for(TaskStep taskStep : taskSteps){
                Map map = new HashMap();
                map.put("taskStep",taskStep);
                TaskStepImgExample taskStepImgExample = new TaskStepImgExample();
                taskStepImgExample.createCriteria().andTaskStepIdEqualTo(taskStep.getId());
                List<TaskStepImg> taskStepImages = imgMapper.selectByExample(taskStepImgExample);
                map.put("taskStepImages",taskStepImages);
                data.add(map);
            }
        }

        return RespBean.success(data);
    }
}
