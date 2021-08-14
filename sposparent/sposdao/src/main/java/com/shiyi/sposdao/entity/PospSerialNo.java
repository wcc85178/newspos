package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PospSerialNo implements Serializable {
    private Integer id;

    private String security;

    private Integer pospSerialNo;

    private Integer version;

    private static final long serialVersionUID = 1L;
}