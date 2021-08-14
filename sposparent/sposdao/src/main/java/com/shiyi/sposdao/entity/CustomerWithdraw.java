package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CustomerWithdraw implements Serializable {
    private Integer id;

    private String security;

    private String addr;

    private BigDecimal agentGain;

    private Integer agentId;

    private BigDecimal amount;

    private String bankCardCity;

    private String bankCardCode;

    private String bankCardName;

    private String bankCardProvince;

    private String bankName;

    private String bankSubName;

    private String city;

    private BigDecimal clearAmount;

    private String clearBatchNo;

    private String clearDateStr;

    private Long clearDatetime;

    private Integer clearFlag;

    private Integer clearType;

    private Long createTime;

    private Integer customerId;

    private BigDecimal fee;

    private String mark;

    private BigDecimal oemGain;

    private String position;

    private static final long serialVersionUID = 1L;
}