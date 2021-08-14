package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 商户入网费率配置
 */
@Data
public class MerchantRate implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer customerId;

    /**
     * 商户id
     */
    private Integer merchantId;

    /**
     * 交易码
     */
    private String transCode;

    /**
     * 借记卡费率
     */
    private BigDecimal debitRate;

    /**
     * 借记卡封顶金额
     */
    private BigDecimal debitMaxAmt;

    /**
     * 借记卡手续费最低值
     */
    private BigDecimal debitLowLimit;

    /**
     * 贷记卡费率
     */
    private BigDecimal creditRate;

    /**
     * 贷记卡手续费最低值
     */
    private BigDecimal creditLowLimit;

    /**
     * 0-未开通；1-已开通；2-开通失败；
     */
    private String state;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}