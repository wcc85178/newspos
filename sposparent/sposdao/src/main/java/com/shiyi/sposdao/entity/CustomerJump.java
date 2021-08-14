package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CustomerJump implements Serializable {
    private Integer id;

    private String security;

    private Long createTime;

    private Integer enableFlag;

    private BigDecimal highMoney;

    private BigDecimal lowMoney;

    private Integer ruleFlag;

    private static final long serialVersionUID = 1L;
}