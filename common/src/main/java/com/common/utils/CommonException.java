package com.common.utils;

import com.common.pojo.RespBean;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author  xiaomi
 * @create  2020/7/7
 * 
 **/
@Data
@ControllerAdvice
@Slf4j
public class CommonException extends RuntimeException {
    //错误消息
    String msg;

    public CommonException(){}

    public CommonException(String msg){
        this.msg = msg;
    }

    /**
     * 抛出异常，触发事务回滚
     * @param text 错误提示
     */
    public static RespBean throwNewCommonException(String text){
        throw new CommonException(text);
    }

    /**
     * @author  xiaomi
     * @create  2021/2/2
     * 登陆状态校验
     **/
    public static RespBean loginErr(){
        return RespBean.fail("请重新登录！");
    }

    /**
     * 校验参数
     */
    public static void verifyObjects(Object... params){
        for(Object param: params){
            if(param == null || param.equals("")){
                CommonException.throwNewCommonException("参数异常！");
            }
        }
    }
    public static boolean verifyList(List<?> list){
        return list == null || list.size() < 1 ? true : false;
    }
    public static void verifyList(List<?> list,String msg){
        if(list == null || list.size() < 1) CommonException.throwNewCommonException(msg);
    }

    /**
     * @author  xiaomi
     * @create  2020/7/8
     * 增，删，改结果处理
     **/
    public static RespBean resultHandler(Integer result){
        if(result == null || result < 1){
            throwNewCommonException("操作失败,请重试！");
        }
        return RespBean.success();
    }

    /**
     * 系统异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public RespBean defaultErrorHandler(Exception e){
        e.printStackTrace();
        if(e instanceof DuplicateKeyException){
            return RespBean.fail("数据已存在，无需重复添加！");
        }
        return RespBean.fail("系统处理异常！");
    }
    /**
     * @author  xiaomi
     * @create  2021/2/2
     * 手动调用
     **/
    public static RespBean exceptionHandler(Exception e,String msg){
        e.printStackTrace();
        return RespBean.fail(StringUtils.hasLength(msg) ? msg : "系统处理异常");
    }

    /**
     * 自定义异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = CommonException.class)
    @ResponseBody
    public RespBean commonErrorHandler(CommonException e){
        e.printStackTrace();
        return RespBean.fail(StringUtils.hasLength(e.getMsg()) ? e.getMsg() : "系统处理异常");
    }
}