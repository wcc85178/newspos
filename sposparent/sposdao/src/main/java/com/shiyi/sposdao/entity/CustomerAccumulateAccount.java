package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 用户积分账户表
 */
@Data
public class CustomerAccumulateAccount implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * customer表id
     */
    private Integer customerId;

    /**
     * 积分账户唯一编号,积分系统产生
     */
    private String jfAccountId;

    /**
     * 免登录标记，积分系统产生
     */
    private String jfNologinFlag;

    /**
     * 积分数量
     */
    private Integer jfAccountBalance;

    /**
     * 账号状态 0 无效 1 正常
     */
    private Integer flag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}