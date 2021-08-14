package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class AgentGreenBalanceRunning implements Serializable {
    private Integer id;

    private String security;

    private Integer agentId;

    private BigDecimal amount;

    private String clearBatch;

    private String clearDateStr;

    private Integer clearTaskId;

    private Long createTime;

    private String mark;

    private static final long serialVersionUID = 1L;
}