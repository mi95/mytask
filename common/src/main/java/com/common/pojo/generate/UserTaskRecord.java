package com.common.pojo.generate;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  xiaomi
 * @create  2021/4/7
 * 
 **/
/**
    * 用户任务操作记录
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTaskRecord implements Serializable {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 操作人编号
    */
    private Integer userId;

    /**
    * 用户任务编号
    */
    private Integer userTaskId;

    /**
    * 备注
    */
    private String remark;

    /**
    * 类型 0-审核不通过 1-提交 2-审核通过
    */
    private Integer type;

    private static final long serialVersionUID = 1L;
}