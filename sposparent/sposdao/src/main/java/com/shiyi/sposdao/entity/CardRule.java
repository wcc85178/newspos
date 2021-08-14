package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CardRule implements Serializable {
    private Integer id;

    private String security;

    private String card;

    private Long createTime;

    private Integer dayTransCountLimit;

    private BigDecimal dayTransLimit;

    private Integer enableFlag;

    private BigDecimal monthTransLimit;

    private BigDecimal oneTransLimit;

    private BigDecimal transDownLine;

    private String editor;

    private static final long serialVersionUID = 1L;
}