package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CityJump implements Serializable {
    private Integer id;

    private String security;

    private Integer openFlag;

    private static final long serialVersionUID = 1L;
}