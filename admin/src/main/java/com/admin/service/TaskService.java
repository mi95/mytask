package com.admin.service;

import com.alibaba.fastjson.JSONObject;
import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import com.common.pojo.generate.TaskInfos;
import com.common.pojo.generate.UserTask;
import com.common.pojo.generate.UserTaskRecord;

public interface TaskService {
    RespBean addOrUpdTask(JSONObject jsonObject);

    RespBean updTask(TaskInfos taskInfos);

    RespBean taskPageList(ReqParam reqParam);

    RespBean taskNoPage(ReqParam reqParam);

    RespBean queryTaskDetail(Integer taskId);

    RespBean auditTask(UserTaskRecord param);

    RespBean queryUserTask(ReqParam reqParam);

    RespBean queryUserTaskDetail(Integer userTaskId);
}
