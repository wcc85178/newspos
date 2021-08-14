package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 用户达标表
 */
@Data
public class CustomerNewKpi implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 001:小蓝牙，002：大蓝牙
     */
    private String appId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 直属代理商
     */
    private Integer agentId;

    /**
     * 直属代理商名字
     */
    private String agentName;

    /**
     * 上上级代理商关系
     */
    private String agents;

    /**
     * 用户手机号码
     */
    private String userTel;

    /**
     * 用户姓名
     */
    private String customerName;

    /**
     * 达标信用卡号
     */
    private String carditcard;

    /**
     * 绑定终端编号
     */
    private String ksn;

    /**
     * t0累计交易金额
     */
    private BigDecimal t0Amt;

    /**
     * 信用卡达标状态1，0：达标中, 1：已达标
     */
    private Short kpiCardFalg;

    /**
     * T0交易金额达标状态2，0：达标中, 1：已达标
     */
    private Short kpiT0amtFalg;

    /**
     * 达标状态，0：达标中, 1：已达标, -1:未达标
     */
    private Short kpiFalg;

    /**
     * 添加日期
     */
    private Date kpiAddTime;

    /**
     * 达标日期
     */
    private Date kpiDbTime;

    private BigDecimal btJine;

    private BigDecimal shiyiBtAmount;

    /**
     * 0 未补贴 1 已补贴
     */
    private Short btFlag;

    private static final long serialVersionUID = 1L;
}