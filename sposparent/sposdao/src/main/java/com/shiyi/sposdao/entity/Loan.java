package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Loan implements Serializable {
    private Integer id;

    private String security;

    private String addr;

    private BigDecimal amount;

    private Integer auditFlag;

    private String bohuiMark;

    private Long createTime;

    private String gongjijin;

    private String img1;

    private String img2;

    private String img3;

    private String loanLimit;

    private String mark;

    private String name;

    private String nianshouru;

    private Integer overLoan;

    private String pyCardCode;

    private String pyName;

    private String pyTel;

    private BigDecimal realAmount;

    private String tel;

    private String yishebao;

    private static final long serialVersionUID = 1L;
}