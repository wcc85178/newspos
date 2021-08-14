package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 用户信用卡表
 */
@Data
public class CustomerCreditcards implements Serializable {
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
     * 银行预留手机号码
     */
    private String userTel;

    /**
     * 用户姓名
     */
    private String customerName;

    /**
     * 信用卡号
     */
    private String carditcard;

    /**
     * 状态，0：关闭, 1：开启
     */
    private Short isactive;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 发卡银行logo URL
     */
    private String bankImgUrl;

    private static final long serialVersionUID = 1L;
}