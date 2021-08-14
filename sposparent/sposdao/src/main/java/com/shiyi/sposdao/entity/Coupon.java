package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 优惠券表
 */
@Data
public class Coupon implements Serializable {
    private Integer id;

    /**
     * 优惠券名称
     */
    private String name;

    /**
     * 类型,0 满减 1 费率优惠
     */
    private Integer type;

    /**
     * 有效天数
     */
    private Integer validDay;

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
     * 已发放数量
     */
    private Integer giveOutNum;

    /**
     * 已使用数量
     */
    private Integer isUsedNum;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}