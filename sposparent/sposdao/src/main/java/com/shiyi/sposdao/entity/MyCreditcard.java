package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 用户信用卡还款卡号表
 */
@Data
public class MyCreditcard implements Serializable {
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
     * 用户号,手机号, 唯一标识
     */
    private String username;

    /**
     * 信用卡号
     */
    private String carditcard;

    /**
     * 最近一次还款时间
     */
    private Date hkDatetime;

    /**
     * 最近一次还款金额
     */
    private BigDecimal hkAmt;

    private static final long serialVersionUID = 1L;
}