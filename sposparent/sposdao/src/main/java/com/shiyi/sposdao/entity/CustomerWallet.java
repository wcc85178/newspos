package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CustomerWallet implements Serializable {
    private Integer id;

    private String security;

    private BigDecimal balance;

    private Long balanceUpdateTime;

    private Long createTime;

    private Integer version;

    private BigDecimal withdrawBalance;

    private Integer refCustomerId;

    private static final long serialVersionUID = 1L;
}