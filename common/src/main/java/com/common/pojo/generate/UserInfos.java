package com.common.pojo.generate;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfos implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 电话
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 推荐人
     */
    private Integer parentId;

    /**
     * 名称
     */
    private String name;

    /**
     * 团队人数
     */
    private Integer teamNum;

    /**
     * 余额
     */
    private Integer balance;

    private static final long serialVersionUID = 1L;
}