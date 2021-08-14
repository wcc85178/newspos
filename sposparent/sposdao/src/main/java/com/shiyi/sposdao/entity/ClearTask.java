package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class ClearTask implements Serializable {
    private Integer id;

    private String security;

    private BigDecimal agentGain;

    private Integer agentNum;

    private BigDecimal clearAmount;

    private String clearBatch;

    private Integer clearFlag;

    private Integer clearNum;

    private String clearTime;

    private Integer clearType;

    private Long createTime;

    private Integer customerNum;

    private Long eTime;

    private String mark;

    private BigDecimal oemGain;

    private BigDecimal standFee;

    private BigDecimal transAmount;

    private Integer version;

    private static final long serialVersionUID = 1L;
}