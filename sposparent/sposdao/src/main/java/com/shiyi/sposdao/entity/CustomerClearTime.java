package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CustomerClearTime implements Serializable {
    private Integer id;

    private String security;

    private Long lastClearTime;

    private Integer version;

    private Integer refCustomerId;

    private static final long serialVersionUID = 1L;
}