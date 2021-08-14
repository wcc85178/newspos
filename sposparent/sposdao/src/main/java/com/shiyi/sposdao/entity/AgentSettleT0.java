package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class AgentSettleT0 implements Serializable {
    private Integer id;

    private String security;

    private Integer agentId;

    private String agentName;

    private String bankCardCity;

    private String bankCardCode;

    private String bankCardName;

    private String bankCardProvince;

    private String bankName;

    private String bankSubName;

    private String clearBatch;

    private String clearDateStr;

    private Integer clearNum;

    private String manName;

    private String manTel;

    private BigDecimal settleAmount;

    private Integer settleFlag;

    private Long settleTime;

    private BigDecimal transAmount;

    private static final long serialVersionUID = 1L;
}