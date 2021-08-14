package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 代付确认表
 */
@Data
public class DaifuCheck implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 交易流水号
     */
    private Integer ftpTrandId;

    /**
     * 银行卡号
     */
    private String ftpBankCard;

    /**
     * 金额
     */
    private String ftpAmount;

    /**
     * 时间
     */
    private Long ftpTime;

    /**
     * 代付卡号
     */
    private String dfBankCard;

    /**
     * 姓名
     */
    private String name;

    /**
     * 时间
     */
    private String personDfTime;

    /**
     * 代付时间
     */
    private String dfTime;

    /**
     * 代付金额
     */
    private String dfAmout;

    /**
     * 返回信息
     */
    private String checkMessage;

    /**
     * 返回码
     */
    private String checkCode;

    private static final long serialVersionUID = 1L;
}