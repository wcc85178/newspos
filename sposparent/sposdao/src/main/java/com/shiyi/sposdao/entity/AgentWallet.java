package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class AgentWallet implements Serializable {
    private Integer id;

    private String security;

    private Long createTime;

    private BigDecimal greenBalance;

    private Long greenBalanceUpdateTime;

    private BigDecimal margin;

    private Integer version;

    private BigDecimal withdrawGain;

    private Integer refAgentId;

    private static final long serialVersionUID = 1L;
}