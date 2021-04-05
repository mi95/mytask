package com.common.pojo.generate;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 任务步骤表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskStep implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 任务编号
     */
    private Integer taskId;

    /**
     * 步骤编号
     */
    private Integer stepNum;

    /**
     * 步骤描述
     */
    private String reamrk;

    private static final long serialVersionUID = 1L;
}