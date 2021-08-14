package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 银胜优惠费率记录表
 */
@Data
public class CustomerFeeRate implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer customerId;

    /**
     * 累计金额
     */
    private String accAmount;

    /**
     * 目标金额
     */
    private String goalAmount;

    /**
     * 开始日期
     */
    private Date startDay;

    /**
     * 结束日期
     */
    private Date endDay;

    /**
     * 优惠状态 0 标注 1 优惠
     */
    private Integer feeState;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}