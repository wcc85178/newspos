package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpMetaBill implements Serializable {
    private Integer id;

    private String security;

    private String code;

    private Integer fieldSort;

    private Integer isCondition;

    private Integer isListShow;

    private String name;

    private String refDataUrl;

    private Integer required;

    private Integer type;

    private Integer width;

    private Integer unqiued;

    private Integer systemControl;

    private String defaultValue;

    private Integer onlycankao;

    private static final long serialVersionUID = 1L;
}