package com.app.controller;

import com.alibaba.fastjson.JSONObject;
import com.app.service.UserService;
import com.common.pojo.RespBean;
import com.common.pojo.generate.UserInfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService memberService;

    @PostMapping("login")
    public RespBean login(@RequestBody UserInfos userInfos){
        return memberService.login(userInfos);
    }

    @PostMapping("register")
    public RespBean register(@RequestBody UserInfos userInfos){
        return memberService.register(userInfos);
    }

    @PatchMapping
    public RespBean updUser(@RequestBody JSONObject jsonObject){
        return memberService.updUser(jsonObject);
    }

    @GetMapping("{userId}")
    public RespBean selectUser(@PathVariable Integer userId){
        return memberService.selectUser(userId);
    }
}
