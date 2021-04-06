package com.common.pojo.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  xiaomi
 * @create  2021/4/6
 * 
 **/

/**
 * 任务表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskInfos implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 任务价格
     */
    private BigDecimal price;

    /**
     * 状态 0-禁用 1-正常
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}