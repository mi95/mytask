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
 * 图片表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskStepImg implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 步骤编号
     */
    private Integer taskStepId;

    /**
     * 图片路径
     */
    private String imgUrl;

    /**
     * 任务编号
     */
    private Integer taskId;

    private static final long serialVersionUID = 1L;
}