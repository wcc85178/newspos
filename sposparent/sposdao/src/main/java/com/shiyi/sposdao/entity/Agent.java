package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Agent implements Serializable {
    private Integer id;

    private String security;

    /**
     * 2.0代理的附属关系
     */
    private String affiliation;

    private Integer auditFlag;

    private String bankCardCity;

    private String bankCardCode;

    private String bankCardName;

    private String bankCardProvince;

    private Integer bankCardType;

    private String bankName;

    private String bankSubName;

    private String bohuiMark;

    private Long createTime;

    private Integer enableFlag;

    private String fengdingFenrun;

    private String imgBankLicense;

    private String imgBusinessLicense;

    private String imgHandIdCard;

    private String imgIdCardDown;

    private String imgIdCardUp;

    private String imgOrganization;

    private String imgXieyi1;

    private String imgXieyi2;

    private String imgXieyi3;

    private String manEmail;

    private String manIdCard;

    private String manName;

    private String manTel;

    private String mark;

    private String name;

    private String daquAgentId;

    private Integer parentId;

    private Integer parentType;

    private String password;

    private String t0fenrun1;

    /**
     * 银联T0单笔成本费率
     */
    private String t0fenrun2;

    private String t0fenrun3;

    private String t0fenrun4;

    private String t0fenrun5;

    private String t0fenrun6;

    /**
     * 银联T0单笔成本
     */
    private String t0fenrunMark;

    private String t1fenrun1;

    /**
     * 银联T1单笔成本费率
     */
    private String t1fenrun2;

    private String t1fenrun3;

    private String t1fenrun4;

    private String t1fenrun5;

    private String t1fenrun6;

    /**
     * 说明用户资金的处理方式
     */
    private String t1fenrunMark;

    private String username;

    /**
     * 操作员
     */
    private String operatorName;

    /**
     * 单本成本
     */
    private String agentDrawFee;

    private String totalmargin;

    private Double countcustomer;

    private Double countstandard;

    private Double posnum;

    private Double actnum;

    private String actscale;

    /**
     * 提醒费
     */
    private String counterFee;

    /**
     * 代理商 - SPP 结算账户ID
     */
    private Integer agentAccountid;

    /**
     * 分润标记,0:正常分润（默认），1:分润日结
     */
    private Short fenrunFlag;

    /**
     * 自有资金账户
     */
    private Integer ownAccountId;

    private Short isAuth;

    /**
     * 1 表示 1.0 代理商 ； 2 表示 2.0 代理商 
     */
    private String agentVersionFlag;

    /**
     * flexible_account_id 活动资金账户
     */
    private Integer flexibleAccountId;

    /**
     * 默认商户费率
     */
    private String initCustomerMccRate;

    /**
     * 1.1 代理商 ； 0 不扣费，1扣费
     */
    private String agentKoufeiFlag;

    private static final long serialVersionUID = 1L;
}