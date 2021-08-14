package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 代付记录表
 */
@Data
public class Daifu implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 商户手机号
     */
    private String customerCode;

    /**
     * 交易流水号
     */
    private String transId;

    /**
     * 持卡人开户名
     */
    private String bankCardName;

    /**
     * 银行卡号
     */
    private String bankCardNo;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 商户扣率
     */
    private String customerRate;

    /**
     * 交易金额
     */
    private BigDecimal amount;

    /**
     * 商户金额
     */
    private BigDecimal customerAmount;

    /**
     * 代付时间
     */
    private Date payTime;

    /**
     * 代付确认时间
     */
    private Date confirmTime;

    /**
     * 消费渠道
     */
    private String payChannel;

    /**
     * 联行号（可空）
     */
    private String bankUnionCode;

    /**
     * 代理商（可空）
     */
    private String agentName;

    /**
     * 代付状态
     */
    private String payStatus;

    /**
     * 代付流水号
     */
    private String paySerialNo;

    /**
     * 代付批次号
     */
    private String payBatchNo;

    /**
     * 所属代理商
     */
    private String security;

    /**
     * 代付请求返回码
     */
    private String payRspCode;

    /**
     * 确认代付请求响应码
     */
    private String confirmRspCode;

    /**
     * 备注
     */
    private String mark;

    /**
     * 交易归属 默认0
     */
    private Integer reqFrom;

    /**
     * 交易时间
     */
    private Long pospTransDate;

    /**
     * 联行号
     */
    private String bankUnionpayCode;

    /**
     * 关联商户id
     */
    private Integer refCustomerId;

    private static final long serialVersionUID = 1L;
}