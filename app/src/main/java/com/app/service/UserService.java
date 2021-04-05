package com.app.service;

import com.alibaba.fastjson.JSONObject;
import com.common.pojo.RespBean;
import com.common.pojo.generate.UserInfos;

public interface UserService {
    RespBean login( UserInfos userInfos);

    RespBean register( UserInfos userInfos);

    RespBean updUser( JSONObject jsonObject);

    RespBean selectUser(Integer userId);
}
