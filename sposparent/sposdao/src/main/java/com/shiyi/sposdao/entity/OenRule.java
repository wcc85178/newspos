package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class OenRule implements Serializable {
    private Integer id;

    private String security;

    private Long createTime;

    private Integer enableFlag;

    private String oenCode;

    private BigDecimal outTransDayLimit;

    private BigDecimal outTransOneLimit;

    private BigDecimal transferDayLimit;

    private Integer transferDayTransCountLimit;

    private BigDecimal transferOneLimit;

    private static final long serialVersionUID = 1L;
}