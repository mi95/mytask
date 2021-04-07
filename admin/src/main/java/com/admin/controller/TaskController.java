package com.admin.controller;

import com.admin.service.TaskService;
import com.alibaba.fastjson.JSONObject;
import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import com.common.pojo.generate.TaskInfos;
import com.common.pojo.generate.UserTaskRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("task")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping
    public RespBean addOrUpdTask(@RequestBody JSONObject jsonObject){
        return taskService.addOrUpdTask(jsonObject);
    }

    @PatchMapping
    public RespBean updTask(@RequestBody TaskInfos taskInfos){
        return taskService.updTask(taskInfos);
    }

    @GetMapping("page")
    public RespBean taskPageList(ReqParam reqParam){
        return taskService.taskPageList(reqParam);
    }

    @GetMapping
    public RespBean taskNoPage(ReqParam reqParam){
        return taskService.taskNoPage(reqParam);
    }

    @GetMapping("detail/{taskId}")
    public RespBean queryTaskDetail(@PathVariable Integer taskId){
        return taskService.queryTaskDetail(taskId);
    }

    @PostMapping("audit")
    RespBean auditTask(@RequestBody UserTaskRecord userTaskRecord){
        return taskService.auditTask(userTaskRecord);
    }

    @GetMapping("userTask")
    RespBean queryUserTask(ReqParam reqParam){
        return taskService.queryUserTask(reqParam);
    }

    @GetMapping("userTaskDetail/{userTaskId}")
    RespBean queryUserTaskDetail(@PathVariable Integer userTaskId){
        return taskService.queryUserTaskDetail(userTaskId);
    }
}
