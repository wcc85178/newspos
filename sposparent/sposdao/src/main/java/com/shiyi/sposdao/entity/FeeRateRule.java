package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class FeeRateRule implements Serializable {
    private Integer id;

    private String security;

    private Long createTime;

    private BigDecimal fengdingFee;

    private BigDecimal fengdingLine;

    private Integer mccFlag;

    private BigDecimal rate;

    private static final long serialVersionUID = 1L;
}