package com.common.pojo.generate;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  xiaomi
 * @create  2021/4/7
 * 
 **/

/**
 * 用户任务图片表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTaskImg implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 用户任务编号
     */
    private Integer userTaskId;

    /**
     * 图片路径
     */
    private String imgUrl;

    private static final long serialVersionUID = 1L;
}