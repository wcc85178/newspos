package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannelAgentWhite implements Serializable {
    private Integer id;

    private String agentIdList;

    private Date transTimeStart;

    private Date transTimeEnd;

    private BigDecimal transAmount;

    private static final long serialVersionUID = 1L;
}