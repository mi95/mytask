package com.common.utils;

import java.util.List;

/**
 * @author xiaomi
 * @create 2020/11/20
 **/
public class DataVerifyUtil {
    /**
     * @author  xiaomi
     * @create  2020/11/20
     * 校验整形
     * false: =null || <0
     **/
    public static boolean isNotNull(Integer... nums){
        for(Integer num : nums){
            if(num == null || num < 0){
                return false;
            }
        }
        return true;
    }

    /**
     * @author  xiaomi
     * @create  2020/11/20
     * 校验字符串
     * false: =null || =""
     **/
    public static boolean isNotNull(String... strings){
        for(String str : strings){
            if(str == null || str == "" || str.length() < 1){
                return false;
            }
        }
        return true;
    }

    /**
     * @author  xiaomi
     * @create  2020/11/20
     * 校验list
     * false: =null || size<1
     **/
    public static boolean isNotNull(List<?> list){
        if(list == null || list.size() < 1){
            return false;
        }
        return true;
    }

    /**
     * @author  xiaomi
     * @create  2020/11/20
     * 校验obj
     * false: =null || =""
     **/
    public static boolean isNotNull(Object... objects){
        for(Object obj : objects){
            if(obj == null || obj.equals("")){
                return false;
            }
        }
        return true;
    }
}
