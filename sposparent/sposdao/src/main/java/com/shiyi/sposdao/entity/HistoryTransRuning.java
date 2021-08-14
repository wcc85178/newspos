package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class HistoryTransRuning implements Serializable {
    private Integer id;

    private String security;

    private String acquirer;

    private Integer agentId;

    private String agentName;

    private BigDecimal amount;

    private Integer antiActionFlag;

    private String authNo;

    private String bankCard;

    private Long clearDatetime;

    private Integer clearFlag;

    private Integer clearType;

    private BigDecimal customerAmount;

    private String customerCode;

    private String customerName;

    private BigDecimal customerRate;

    private BigDecimal fareFee;

    private BigDecimal fareRate;

    private BigDecimal gain;

    private String issuer;

    private String mccCode;

    private String oldRequestCode;

    private String originCPospBatchNo;

    private String originCPospRunningNo;

    private String originCSerialNo;

    private String originCTransDateStr;

    private Long originCTransDatetime;

    private String originCTransTimeStr;

    private String originPosBatchNo;

    private String originPosRunningNo;

    private String originPospSerialNo;

    private Long originPospTransDatetime;

    private String originTransDateStr;

    private String originTransTimeStr;

    private String payChannelCustomerName;

    private BigDecimal payChannelFee;

    private BigDecimal payChannelRate;

    private String payChannelResultCode;

    private String payChannelSerialNo;

    private String payChannelTransDateStr;

    private Long payChannelTransDatetime;

    private String payChannelTransTimeStr;

    private String posBatchNo;

    private String posMtiCode;

    private String posNo;

    private String posOperator;

    private String posRequestCode;

    private Integer posRequestResult;

    private Integer posRequestType;

    private String posResultCode;

    private String posRunningNo;

    private String posTransDateStr;

    private Long posTransDatetime;

    private String posTransTimeStr;

    private String pospBatchNo;

    private String pospCustomerCode;

    private BigDecimal pospFee;

    private String pospNo;

    private String pospRunningNo;

    private String pospSerialNo;

    private String pospTransDateStr;

    private Long pospTransDatetime;

    private String pospTransTimeStr;

    private Integer profitType;

    private static final long serialVersionUID = 1L;
}