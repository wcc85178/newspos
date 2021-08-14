package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class AreaCode implements Serializable {
    private Integer id;

    private String security;

    private String areaCode;

    private String city;

    private String province;

    private static final long serialVersionUID = 1L;
}