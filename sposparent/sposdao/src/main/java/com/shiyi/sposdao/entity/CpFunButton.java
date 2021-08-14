package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpFunButton implements Serializable {
    private Integer id;

    private String security;

    private Integer funId;

    private static final long serialVersionUID = 1L;
}