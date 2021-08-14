package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class BankAuthQuickPay implements Serializable {
    /**
     * 银行卡bin号
     */
    private String cardprefixnum;

    private String lenth;

    private String cardNoLength;

    /**
     * 开户行名称
     */
    private String bankname;

    private String bankcode;

    private static final long serialVersionUID = 1L;
}