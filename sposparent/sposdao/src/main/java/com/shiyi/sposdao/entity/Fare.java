package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Fare implements Serializable {
    private Integer id;

    private String security;

    private Integer clearType;

    private Long fromTime;

    private String name;

    private BigDecimal rate;

    private Long stopTime;

    private static final long serialVersionUID = 1L;
}