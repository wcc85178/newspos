package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PosRule implements Serializable {
    private Integer id;

    private String snCode;

    private BigDecimal dayTransLimit;

    private BigDecimal oneTransLimit;

    private static final long serialVersionUID = 1L;
}