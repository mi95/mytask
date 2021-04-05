package com.common.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


public class CommonUtils {
    /**
     * 获取list实例
     *
     * @return
     */
    @SafeVarargs
    public static <T> List<T> getList(T... ts) {
        List<T> list = new ArrayList<T>();
        for (T t : ts) {
            list.add(t);
        }
        return list;
    }


    /**
     * 模糊匹配字符串
     *
     * @param para
     * @return
     */
    public static String getLikeStr(Object para) {
        if(para == null){
            return null;
        }
        return "%" + para + "%";
    }

    public static Integer getUserId(HttpServletRequest request){
        Object userId = request.getSession().getAttribute("userId");
        return userId == null ? null : Integer.valueOf(userId.toString());
    }
}