package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 其他交易记录表(除T0、T1交易外)
 */
@Data
public class OtherTransRuning implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer customerId;

    /**
     * mer
     */
    private String mer;

    /**
     * 终端了流水号
     */
    private String f11;

    /**
     * 地址
     */
    private String addr;

    /**
     * 标识T0和T1交易,0:T0、1:T1
     */
    private Integer tnFlag;

    /**
     * 交易订单号
     */
    private String tradeOid;

    /**
     * 交易金额
     */
    private BigDecimal amount;

    /**
     * 银行卡号(出) 二维码交易时,存放qrcode
     */
    private String outAccountNo;

    /**
     * 银行卡号(入) 主扫存入结算账卡号
     */
    private String inAccountNo;

    /**
     * 机器号
     */
    private String bodyNo;

    /**
     * 城市
     */
    private String city;

    /**
     * 商户结算金额(扣除手续费)
     */
    private BigDecimal customerAmount;

    /**
     * 商户手机号(唯一标识)
     */
    private String customerCode;

    /**
     * 商户名称
     */
    private String customerName;

    /**
     * 商户费率
     */
    private String mccRate;

    /**
     * 商户手续费
     */
    private String pospFee;

    /**
     * 交易类型 1:银联二维码T0 2:银联二维码T1 3 支付宝二维码T0 4 支付宝二维码T1 5 银联扫码T0 6 银联扫码T1 7 支付宝扫码T0 8 支付宝扫码T1
     */
    private Integer tradeType;

    /**
     * 落地商户号
     */
    private String payChannelMercode;

    /**
     * 落地终端号
     */
    private String payChannelTermid;

    /**
     * 落地商户名称
     */
    private String payChannelCustomerName;

    /**
     * 交易错误原因
     */
    private String payChannelResultMsg;

    /**
     * 渠道交易返回码
     */
    private String payChannelResultCode;

    /**
     * 0 新建 1 待定 2 成功 3 失败
     */
    private Integer status;

    /**
     * 渠道流水号
     */
    private String payChannelSerialNo;

    /**
     * 渠道交易时间
     */
    private Long posTransDatetime;

    /**
     * 经纬度
     */
    private String position;

    /**
     * 请求交易时间
     */
    private Long pospTransDatetime;

    /**
     * 交易响应码
     */
    private String posResultCode;

    /**
     * 交易请求结果
     */
    private Integer posRequestResult;

    /**
     * 固定费率
     */
    private BigDecimal withdrawFee;

    /**
     * 是否发起代付 0:未发起代付、1:发起代付
     */
    private Integer paidFlag;

    /**
     * 二维码类型 0:银联二维码、1:微信二维码、2:支付宝二维码
     */
    private Integer qrType;

    /**
     * 渠道标识,1标识1.0;2 标识 2.0
     */
    private Integer orgflag;

    /**
     * 另外基站信息，以|分割，共两个且没有原基站信息
     */
    private String positionAddition;

    /**
     * 请求mkey
     */
    private String posMtiCode;

    /**
     * 是否扣费
     */
    private Integer isCharge;

    /**
     * 扣费金额
     */
    private String frozenAmt;

    /**
     * 商户类型
     */
    private String merchanttype;

    private static final long serialVersionUID = 1L;
}