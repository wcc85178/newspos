package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CustomerBalanceRunning implements Serializable {
    private Integer id;

    private String security;

    private Integer actionFlag;

    private BigDecimal amount;

    private String bankCardCode;

    private String bankName;

    private Long createTime;

    private String inAcount;

    private String mark;

    private String outAcount;

    private Integer refCustomerId;

    private static final long serialVersionUID = 1L;
}