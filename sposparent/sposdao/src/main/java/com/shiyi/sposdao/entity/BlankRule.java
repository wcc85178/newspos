package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class BlankRule implements Serializable {
    private Integer id;

    private String security;

    private String card;

    private Long createTime;

    private String mark;

    private static final long serialVersionUID = 1L;
}