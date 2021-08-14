package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpFunButtonConfig implements Serializable {
    private Integer id;

    private String security;

    private String code;

    private Integer comfirm;

    private String eventMethod;

    private String iconClass;

    private Integer showable;

    private String text;

    private Integer unSelectRecord;

    private Integer promptFlag;

    private static final long serialVersionUID = 1L;
}