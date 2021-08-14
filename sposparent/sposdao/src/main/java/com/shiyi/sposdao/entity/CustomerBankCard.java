package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 商户绑定结算卡
 */
@Data
public class CustomerBankCard implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 代理关系
     */
    private String security;

    /**
     * 开户城市
     */
    private String bankCardCity;

    /**
     * 卡号
     */
    private String bankCardCode;

    /**
     * 姓名
     */
    private String bankCardName;

    /**
     * 省份
     */
    private String bankCardProvince;

    /**
     * 银行
     */
    private String bankName;

    /**
     * 支行
     */
    private String bankSubName;

    /**
     * 绑定时间
     */
    private Long createTime;

    /**
     * 关联商户id
     */
    private Integer refCustomerId;

    /**
     * 联行号
     */
    private String bankUnionpayCode;

    /**
     * 是否黑名单
     */
    private String blackFlag;

    /**
     * 卡片长度
     */
    private Integer length;

    /**
     * 卡bin
     */
    private String cardbin;

    /**
     * 判断银行
     */
    private String judgeBankName;

    /**
     * 判断总行
     */
    private String bankUnionpayCodeAll;

    private static final long serialVersionUID = 1L;
}