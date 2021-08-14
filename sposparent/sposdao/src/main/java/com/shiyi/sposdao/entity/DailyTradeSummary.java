package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 用户日交易统计表
 */
@Data
public class DailyTradeSummary implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 用户号,唯一标识
     */
    private String username;

    /**
     * 交易时间 yyyyMMdd
     */
    private Integer tradetime;

    /**
     * 当天总交易金额
     */
    private BigDecimal totalAmt;

    /**
     * 当天总成功交易金额
     */
    private BigDecimal totalSuccessAmt;

    /**
     * 当天总成功交易笔数
     */
    private BigDecimal totalSuccessCount;

    /**
     * 当天总失败交易金额
     */
    private BigDecimal totalFailedAmt;

    /**
     * 当天总失败交易笔数
     */
    private BigDecimal totalFailedCount;

    /**
     * 0:T+0交易、1:T+1交易、2:T0银联二维码、3:信用卡还款，4:T1银联二维码
     */
    private Integer tradeType;

    private static final long serialVersionUID = 1L;
}