package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Mcc implements Serializable {
    private Integer id;

    private String security;

    private String code;

    private Long createTime;

    private String experience;

    private Integer feeType;

    private Integer industryType;

    private String mark;

    private String operatorName;

    private static final long serialVersionUID = 1L;
}