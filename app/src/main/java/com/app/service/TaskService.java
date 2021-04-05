package com.app.service;

import com.alibaba.fastjson.JSONObject;
import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;

public interface TaskService {

    RespBean selectTaskList(ReqParam reqParam);

    RespBean selectTaskDetail(Integer taskId);

    RespBean submitUserTask(JSONObject object);
}
