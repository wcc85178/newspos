package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CustomerKeys implements Serializable {
    private Integer id;

    private String security;

    private Long lastSignTime;

    private String tak;

    private String tmk;

    private String tpk;

    private Integer version;

    private Integer refConsumerId;

    private static final long serialVersionUID = 1L;
}