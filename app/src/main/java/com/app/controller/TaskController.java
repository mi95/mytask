package com.app.controller;

import com.alibaba.fastjson.JSONObject;
import com.app.service.TaskService;
import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("task")
@RestController
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping("taskList")
    public RespBean selectTask(@RequestBody ReqParam reqParam){
        return taskService.selectTaskList(reqParam);
    }

    @GetMapping("taskDetail/{taskId}")
    public RespBean selectTaskDetail(@PathVariable Integer taskId){
        return taskService.selectTaskDetail(taskId);
    }

    @PostMapping
    public RespBean submitUserTask(@RequestBody JSONObject jsonObject){
        return taskService.submitUserTask(jsonObject);
    }
}
