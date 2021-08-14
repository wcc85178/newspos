package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class IcCardTagCode implements Serializable {
    private Integer id;

    private String security;

    private String code;

    private Integer icCardGroup;

    private Integer icCardType;

    private String value;

    private static final long serialVersionUID = 1L;
}