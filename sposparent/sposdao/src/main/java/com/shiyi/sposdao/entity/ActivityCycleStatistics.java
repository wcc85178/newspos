package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 周期交易数据统计(统计上周期数据)
 */
@Data
public class ActivityCycleStatistics implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer customerId;

    /**
     * 周期编号
     */
    private Integer cycleNumber;

    /**
     * 周期起始日期
     */
    private Date startDay;

    /**
     * 周期结束日期
     */
    private Date endDay;

    /**
     * 周期累计交易额
     */
    private BigDecimal totalCycleAmt;

    /**
     * 周期累计交易笔数
     */
    private Integer totalCycleCount;

    /**
     * 达标金额
     */
    private BigDecimal reachAmt;

    /**
     * 周期是否达标（0-否 1-是）
     */
    private Integer isReach;

    /**
     * 最后统计时间
     */
    private Date statisticsTime;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 冻结交易号
     */
    private String firstOrderNo;

    private static final long serialVersionUID = 1L;
}