package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class ClearRule implements Serializable {
    private Integer id;

    private String security;

    private BigDecimal clearLowLimit;

    private Integer clearType;

    private static final long serialVersionUID = 1L;
}