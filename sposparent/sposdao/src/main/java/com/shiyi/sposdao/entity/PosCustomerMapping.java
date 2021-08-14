package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PosCustomerMapping implements Serializable {
    private Integer id;

    private String security;

    private Long createTime;

    private static final long serialVersionUID = 1L;
}