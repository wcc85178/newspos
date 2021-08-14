package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Errtrans implements Serializable {
    private String pospSerialNo;

    private BigDecimal amount;

    private static final long serialVersionUID = 1L;
}