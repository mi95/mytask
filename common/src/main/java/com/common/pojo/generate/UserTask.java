package com.common.pojo.generate;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  xiaomi
 * @create  2021/4/6
 * 
 **/

/**
 * 用户任务表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTask implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 任务编号
     */
    private Integer taskId;

    /**
     * 状态 0-审核不通过 1-待审核 2-审核中 3-审核通过
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}