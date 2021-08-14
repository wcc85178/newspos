package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 商户风控表
 */
@Data
public class CustomerRule implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 代理关系
     */
    private String security;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 每日限额
     */
    private BigDecimal dayTransLimit;

    /**
     * 支持卡类型 100090000
     */
    private Integer enableCardType;

    /**
     * 冻结状态 100030001 解冻 100030000 冻结
     */
    private Integer enableFlag;

    /**
     * 每月限额
     */
    private BigDecimal monthTransLimit;

    /**
     * 单笔限额
     */
    private BigDecimal oneTransLimit;

    /**
     * 每日出款限额
     */
    private BigDecimal outDayTransLimit;

    /**
     * 单笔出款限额
     */
    private BigDecimal outOneTransLimit;

    /**
     * 商户id
     */
    private Integer refCustomerId;

    private static final long serialVersionUID = 1L;
}