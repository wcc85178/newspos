package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 卡bin
 */
@Data
public class BankAuth implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 01 借记卡/02 贷记卡/03 准贷记卡 /04 预付费卡
     */
    private Integer bankFlag;

    /**
     * D 借记卡 C贷记卡
     */
    private String code;

    /**
     * 卡片类型
     */
    private String cardtype;

    /**
     * 卡片类型
     */
    private String cardname;

    /**
     * 开户行名称
     */
    private String bankname;

    /**
     * 开户行编码
     */
    private String banknum;

    /**
     * 开户省份
     */
    private String province;

    /**
     * 开户城市
     */
    private String city;

    /**
     * 客服电话
     */
    private String servicephone;

    /**
     * 银行卡bin号
     */
    private String cardprefixnum;

    /**
     * 卡bin长度
     */
    private String lenth;

    /**
     * 卡号长度
     */
    private String cardNoLength;

    /**
     * 联行号
     */
    private String bankUnionpayAll;

    private static final long serialVersionUID = 1L;
}