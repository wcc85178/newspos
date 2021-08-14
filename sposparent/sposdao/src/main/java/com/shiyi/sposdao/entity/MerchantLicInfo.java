package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 商户入网营业信息
 */
@Data
public class MerchantLicInfo implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 商户号
     */
    private String mer;

    /**
     * 商户类型 0-企业 1-个体户 2-个人
     */
    private String merMode;

    /**
     * 工商注册号/统一社会信用码（营业执照）,merMode为0,1时，必传
     */
    private String merLic;

    /**
     * 营业执照有效期起始日期 yyyyMMdd ，merMode为0,1时，必传
     */
    private String licValidStart;

    /**
     * 营业执照有效期截止日期 yyyyMMdd，merMode为0时，必传
     */
    private String licValidEnd;

    /**
     * 注册名称
     */
    private String licName;

    /**
     * 主营业务
     */
    private String businScope;

    /**
     * 注册资本
     */
    private String capital;

    /**
     * 注册资本币种:默认-人民币
     */
    private String capitalCurrency;

    /**
     * 经营省市编码
     */
    private String licAreaCode;

    /**
     * 经营省市
     */
    private String licArea;

    /**
     * 注册地址
     */
    private String licAddr;

    /**
     * 创建时间 
     */
    private Date createTime;

    /**
     * 修改时间 
     */
    private Date updateTime;

    /**
     * 法人姓名
     */
    private String merLegal;

    /**
     * 法人证件类型：0-居民身份证或临时身份证;1-外国公民护照;2-港澳居民来往大陆通行证或其他有效旅游证件；3-其他类个人身份有效证件；4-单位证件；5-军人或武警身份证件
     */
    private String legalType;

    /**
     * 法人证件号码
     */
    private String legalCode;

    /**
     * 法人证件有效期起始日期 yyyyMMdd
     */
    private String legalValidStart;

    /**
     * 法人证件有效期截止日期 yyyyMMdd
     */
    private String legalValidEnd;

    /**
     * 法人手机号
     */
    private String legalPhone;

    /**
     * 法人固定电话
     */
    private String legalMobile;

    /**
     * MCC行业大类
     */
    private String mccMainCategory;

    /**
     * mcc行业小类
     */
    private String mccSubCategory;

    /**
     * mcc小类编码，商户进件时送的mcc
     */
    private String mccSubCode;

    private static final long serialVersionUID = 1L;
}