package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QueryTrans implements Serializable {
    private String customerCode;

    private String customerName;

    private String outAccountNo;

    private String body;

    private String tradeType;

    private String posTransDatetime;

    /**
     * 交易金额
     */
    private BigDecimal amount;

    /**
     * 渠道交易返回码
     */
    private String payChannelResultCode;

    /**
     * 商户费率
     */
    private String mccRate;

    /**
     * 固定费率
     */
    private BigDecimal withdrawFee;

    /**
     * 商户手续费
     */
    private String pospFee;

    /**
     * 商户结算金额(扣除手续费)
     */
    private BigDecimal customerAmount;

    /**
     * 所属代理商ID
     */
    private Integer agentId;

    private static final long serialVersionUID = 1L;
}