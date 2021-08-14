package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpFkMeta implements Serializable {
    private Integer id;

    private String security;

    private Integer funId;

    private Integer metaId;

    private Integer refFunId;

    private String refName;

    private Integer relationShip;

    private static final long serialVersionUID = 1L;
}