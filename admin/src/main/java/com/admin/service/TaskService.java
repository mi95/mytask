package com.admin.service;

import com.alibaba.fastjson.JSONObject;
import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import com.common.pojo.generate.TaskInfos;

public interface TaskService {
    RespBean addOrUpdTask(JSONObject jsonObject);

    RespBean updTask(TaskInfos taskInfos);

    RespBean taskPageList(ReqParam reqParam);

    RespBean taskNoPage(ReqParam reqParam);

    RespBean queryTaskDetail(Integer taskId);
}
