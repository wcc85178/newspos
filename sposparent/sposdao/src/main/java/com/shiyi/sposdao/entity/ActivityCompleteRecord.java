package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 用户周期达标统计记录
 */
@Data
public class ActivityCompleteRecord implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer customerId;

    /**
     * 商户手机号
     */
    private String customerTel;

    /**
     * 冻结金额
     */
    private BigDecimal freezeAmt;

    /**
     * 预定达标金额
     */
    private BigDecimal reachAmt;

    /**
     * 累计交易金额
     */
    private BigDecimal totalAmt;

    /**
     * 达标开始时间
     */
    private Date startDay;

    /**
     * 达标结束时间
     */
    private Date endDay;

    /**
     * 申请状态 0-未申请 1-已申请
     */
    private String returnApplyStatus;

    /**
     * 申请退款时间
     */
    private Date returnApplyTime;

    /**
     * 金额达标状态 0-未达标 1-已达标 
     */
    private String moneyReachStatus;

    /**
     * 时间达标状态 0-未达标 1-已达标
     */
    private String timeReachStatus;

    /**
     * 退款状态 0-未退款 1-T1退款
     */
    private String refundStatus;

    /**
     * 补贴状态 0-未补贴 1-已补贴
     */
    private String allowanceStatus;

    /**
     * 补贴金额
     */
    private BigDecimal allowanceAmt;

    /**
     * 代理商id
     */
    private Integer agentId;

    /**
     * 退款文件生成状态 0-未生成 1-已生成
     */
    private String refundFileCreateStatus;

    /**
     * 退款文件生成时间
     */
    private Date refundFileCreateTime;

    /**
     * 变更结果描述
     */
    private String remark;

    /**
     * 变更时间
     */
    private Date modTime;

    /**
     * 首笔交易订单号
     */
    private String firstOrderNo;

    /**
     * 代理标记
     */
    private String agentType;

    private static final long serialVersionUID = 1L;
}