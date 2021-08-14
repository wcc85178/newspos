package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 商户入网结算信息表
 */
@Data
public class MerchantSettleInfo implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 商户号
     */
    private String mer;

    /**
     * 结算账户开户行名称
     */
    private String bankName;

    /**
     * 结算账户开户行行号
     */
    private String bankCode;

    /**
     * 结算账户账号
     */
    private String account;

    /**
     * 账户名称
     */
    private String accName;

    /**
     * 账户类型：00-对私法人  ，01-对私非法人 ，10-对公
     */
    private String accType;

    /**
     * 开户地区
     */
    private String accArea;

    /**
     * 证件类型：0-居民身份证或临时身份证;1-外国公民护照;2-港澳居民来往大陆通行证或其他有效旅游证件；3-其他类个人身份有效证件；4-单位证件；5-军人或武警身份证件 accType为个人时必填
     */
    private String accLegalCodeType;

    /**
     * 证件号 accType为个人时必填
     */
    private String accLegalCode;

    /**
     * 对私手机号 accType为个人时必填
     */
    private String accPhone;

    /**
     * 创建时间 
     */
    private Date createTime;

    /**
     * 修改时间 
     */
    private Date updateTime;

    /**
     * 结算账户支行名称
     */
    private String subBankName;

    /**
     * 结算人证件有效期 起始日期 yyyyMMdd
     */
    private String accLegalCodeValidStart;

    /**
     * 结算人证件有效期 截止日期 yyyyMMdd
     */
    private String accLegalCodeValidEnd;

    private static final long serialVersionUID = 1L;
}