package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * H5二维码支付记录表
 */
@Data
public class H5payEncryKey implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * H5支付加密唯一key
     */
    private String reqKey;

    /**
     * 商户名称
     */
    private String businName;

    /**
     * 交易金额 单位分
     */
    private BigDecimal amount;

    /**
     * 商户号
     */
    private String mer;

    /**
     * 用户id
     */
    private String customerId;

    /**
     * 支付订单号
     */
    private String payOrderId;

    /**
     * 机具号
     */
    private String snCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * N:未支付 I:支付中  S:支付成功  F:支付失败 
     */
    private String payStatus;

    /**
     * 二维码超时
     */
    private String orderTimeOut;

    /**
     * 微信或支付宝用户id
     */
    private String openId;

    /**
     * 二维码支付类型 支付宝:apPreOrder  微信:wxPreOrder
     */
    private String opt;

    /**
     * 交易日期 yyyyMMdd
     */
    private String transDate;

    /**
     * 新商户标识 0-非新商户 1-新商户
     */
    private String newMerchantFlag;

    /**
     * 当笔是否购买vip  0-不需要购买 1-需要购买
     */
    private String isBuyVip;

    /**
     * 当笔是否是首笔扣费  0-不需要扣费 1-需要扣费
     */
    private String isCharge;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 公众号支付或服务窗支付返回的预支付id
     */
    private String prePayId;

    private static final long serialVersionUID = 1L;
}