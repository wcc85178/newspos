package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 闪付扫码风控表
 */
@Data
public class DbTradeRiskRecord implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer customerId;

    /**
     * 统计日 YYYY-MM-DD
     */
    private String countDate;

    /**
     * 借记卡交易累计金额
     */
    private String dbSumAmount;

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