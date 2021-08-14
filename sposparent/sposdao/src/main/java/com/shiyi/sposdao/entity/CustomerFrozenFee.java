package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 客户达标记录表
 */
@Data
public class CustomerFrozenFee implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 冻结金额 单位 元
     */
    private BigDecimal frozenFee;

    /**
     * 预定达标金额 单位分
     */
    private BigDecimal defaultDabiaoAmt;

    /**
     * 实际达标金额
     */
    private BigDecimal dabiaoAmt;

    /**
     * 达标开始时间
     */
    private Date dabiaoStart;

    /**
     * 达标结束时间
     */
    private Date dabiaoEnd;

    /**
     * 金额是否达标，0未达标，1达标
     */
    private Short dabiaoAmtFlag;

    /**
     * 时间是否达标，0未达标，1达标
     */
    private Short dabiaoDateFlag;

    /**
     * 冻结金额是否已经代付，0未代付，1已代付, 2 T1退款
     */
    private Short frozenFeeFlag;

    /**
     * customer表外键
     */
    private Integer customerId;

    /**
     * 代理商主键
     */
    private Integer agentId;

    /**
     * 代理关系
     */
    private String security;

    /**
     * 交易订单号
     */
    private String transNo;

    /**
     * 补贴标识 1 已补贴 0 未补贴
     */
    private Short btFlag;

    /**
     * 补贴金额
     */
    private String btAmt;

    /**
     * 出款时间  达标时间
     */
    private Date daifuDate;

    /**
     * 33597
     */
    private Integer fid;

    /**
     * 描述
     */
    private String mark;

    /**
     * 备注
     */
    private String otherjson;

    private static final long serialVersionUID = 1L;
}