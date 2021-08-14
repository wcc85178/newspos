package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class EndCustomer implements Serializable {
    private Integer id;

    private String security;

    private Integer auditFlag;

    private String bohuiMark;

    private Long createTime;

    private String imgHandIdCard;

    private String imgIdCardDown;

    private String imgIdCardUp;

    private String mark;

    private String tel;

    private static final long serialVersionUID = 1L;
}