package com.admin.service;

import com.common.pojo.ReqParam;
import com.common.pojo.RespBean;

public interface UserService {
    RespBean selectList(ReqParam reqParam);
}
