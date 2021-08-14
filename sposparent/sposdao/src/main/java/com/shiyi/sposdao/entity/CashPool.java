package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CashPool implements Serializable {
    private Integer id;

    private String security;

    private BigDecimal agentLowGain;

    private BigDecimal balance;

    private BigDecimal margin;

    private String oenCode;

    private Long resetTime;

    private Integer version;

    private BigDecimal withdrawFee;

    private static final long serialVersionUID = 1L;
}