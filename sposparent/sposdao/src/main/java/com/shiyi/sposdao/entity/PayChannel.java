package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannel implements Serializable {
    private Integer id;

    private String security;

    private String code;

    private Long createTime;

    private Integer enableFlag;

    private String ip;

    private String name;

    private Integer needSign;

    private String oak;

    private String omk;

    private String operatorName;

    private String opk;

    private String orgCode;

    private String port;

    private String signDate;

    private static final long serialVersionUID = 1L;
}