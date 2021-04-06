package com.admin.service.impl;

import com.admin.service.UserService;
import com.common.mapper.generate.UserInfosMapper;
import com.common.pojo.PageBean;
import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfosMapper userInfosMapper;


    @Override
    public RespBean selectList(ReqParam reqParam) {
        PageBean.startPage(reqParam);
        return PageBean.dataPage(userInfosMapper.selectByExample(null));
    }
}
