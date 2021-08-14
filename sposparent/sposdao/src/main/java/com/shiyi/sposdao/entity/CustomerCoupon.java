package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 用户优惠券表
 */
@Data
public class CustomerCoupon implements Serializable {
    private Integer id;

    /**
     * coupon表外键
     */
    private Integer couponId;

    /**
     * 优惠券名称 同coupon表
     */
    private String couponName;

    /**
     * 优惠券app显示名称
     */
    private String name;

    /**
     * 类型,0 满减 1 费率优惠
     */
    private Integer type;

    /**
     * 最低可用金额
     */
    private Integer startAmt;

    /**
     * 优惠券优惠说明
     */
    private String desr;

    /**
     * 优惠金额或费率 比如5 或3.8%
     */
    private String preferAmt;

    /**
     * 结算类型 0:T0 1:t1 2:通用
     */
    private String settleType;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 状态：1表示未使用   0表示已使用 3 使用中
     */
    private Integer state;

    /**
     * 获取时间
     */
    private Date createTime;

    /**
     * 用户id
     */
    private Integer customerId;

    /**
     * 优惠券码
     */
    private String couponCode;

    /**
     * 通知方式:1 表示 app 推送通知 2 表示短信通知
     */
    private Integer notifyType;

    /**
     * 短信通知结果:0 短信通知失败  1 短信通知成功
     */
    private Integer messageResult;

    /**
     * 实际优惠金额
     */
    private String couponAmount;

    /**
     * 交易订单号
     */
    private String pospSerialNo;

    /**
     * 交易类型 0:T0 1:t1 
     */
    private String tradeType;

    /**
     * 发放来源 0 表示大蓝牙后台发放 1 表示积分发放
     */
    private Integer fromType;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}