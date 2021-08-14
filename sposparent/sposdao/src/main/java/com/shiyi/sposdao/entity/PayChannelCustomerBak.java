package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannelCustomerBak implements Serializable {
    private Integer id;

    private String security;

    private String code;

    private Long createTime;

    private BigDecimal fengdingLine;

    private BigDecimal fengdingMoney;

    private Long lastSignTime;

    private Long lastUseTime;

    private Integer mccFlag;

    private String name;

    private String operatorName;

    private Integer posMType;

    private String posNo;

    private BigDecimal rate;

    private String snCode;

    private Integer refAreaId;

    private Integer refPayChannelId;

    /**
     * 商户名称
     */
    private String mcc;

    /**
     * 商户名称
     */
    private String merchantName;

    private String province;

    private String city;

    private String key;

    private Integer turnNum;

    private Integer specialFlag;

    private String usedFlag;

    private String t1UsedFlag;

    private BigDecimal availableAmout;

    private BigDecimal originalAmout;

    private Byte standardFlag;

    private String smposFlag;

    private String checkstatus;

    private String regstatus;

    /**
     * 最后一次天眼查的时间
     */
    private Date lastCheckTime;

    /**
     * 0 大商户 1小微商户  100:大商户交易过后 101:小微商户交易过后
     */
    private Short personCustomerFlag;

    /**
     * 渠道标识,1标识1.0;2 标识 2.0
     */
    private Integer orgflag;

    private static final long serialVersionUID = 1L;
}