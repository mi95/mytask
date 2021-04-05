package com.app.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.app.service.UserService;
import com.common.mapper.generate.UserInfosMapper;
import com.common.pojo.RespBean;
import com.common.pojo.generate.UserInfos;
import com.common.pojo.generate.UserInfosExample;
import com.common.utils.CommonException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfosMapper userInfosMapper;
    @Autowired
    HttpServletRequest request;
    @Override
    public RespBean login(UserInfos userInfos) {
        CommonException.verifyObjects(userInfos,userInfos.getPhone(),
                userInfos.getPassword());
        UserInfosExample userInfosExample = new UserInfosExample();
        userInfosExample.createCriteria().andPhoneEqualTo(userInfos.getPhone())
                .andPasswordEqualTo(userInfos.getPassword());
        List<UserInfos> userInfosList = userInfosMapper.selectByExample(userInfosExample);
        if(CommonException.verifyList(userInfosList)){
            CommonException.throwNewCommonException("账号或密码错误！");
        }
        request.getSession().setAttribute("userId",userInfosList.get(0).getId());
        return RespBean.success();
    }

    @Override
    public RespBean register(UserInfos userInfos) {
        CommonException.verifyObjects(userInfos,userInfos.getPhone(),
                userInfos.getPassword());
        UserInfosExample userInfosExample = new UserInfosExample();
        userInfosExample.createCriteria().andPhoneEqualTo(userInfos.getPhone());
        List<UserInfos> userInfosList = userInfosMapper.selectByExample(userInfosExample);
        if(!CommonException.verifyList(userInfosList)){
            CommonException.throwNewCommonException("手机已注册！");
        }
        if(userInfos.getParentId() != null){
            UserInfos parent = userInfosMapper.selectByPrimaryKey(userInfos.getParentId());
            if(parent == null){
                CommonException.throwNewCommonException("推荐码错误！");
            }
        }
        CommonException.resultHandler(userInfosMapper.insertSelective(userInfos));
        request.getSession().setAttribute("userId",userInfos.getId());
        return RespBean.success();
    }

    @Override
    public RespBean updUser(JSONObject object) {
        UserInfos userInfos = object.toJavaObject(UserInfos.class);
        CommonException.verifyObjects(userInfos);
        String oldPwd = object.getString("oldPwd");
        if(StringUtils.hasLength(oldPwd)){
            UserInfosExample userInfosExample = new UserInfosExample();
            userInfosExample.createCriteria().andPasswordEqualTo(oldPwd)
                    .andPhoneEqualTo(userInfos.getPhone());
            CommonException.verifyList(userInfosMapper.selectByExample(userInfosExample),
                    "旧密码错误！");
        }
        CommonException.resultHandler(userInfosMapper.updateByPrimaryKeySelective(userInfos));
        return RespBean.success();
    }

    @Override
    public RespBean selectUser(Integer userId) {
        return RespBean.success(userInfosMapper.selectByPrimaryKey(userId));
    }
}
