package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 120退款记录
 */
@Data
public class Fort1196 implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 冻结记录id
     */
    private Integer cffid;

    /**
     * 代理id
     */
    private Integer outid;

    /**
     * 退还金额
     */
    private String frozenFee;

    /**
     * 商户id
     */
    private Integer customerId;

    /**
     * 33597
     */
    private Integer fid;

    /**
     * 补贴状态 0 为补贴 1 已补贴
     */
    private String btFlag;

    /**
     * 代理关系
     */
    private String security;

    /**
     * 代理id
     */
    private Integer agentId;

    /**
     * 日期
     */
    private String day;

    /**
     * spp账户id
     */
    private Integer accountid;

    /**
     * 姓名
     */
    private String manName;

    /**
     * 银行卡号
     */
    private String bankCardCode;

    /**
     * 联行号
     */
    private String bankUnionpayCodeAll;

    /**
     * 处理状态 0 未处理 1 已处理
     */
    private Byte status;

    /**
     * 时间标识
     */
    private String timeflag;

    /**
     * 达标开始时间
     */
    private Date dabiaoStart;

    private static final long serialVersionUID = 1L;
}