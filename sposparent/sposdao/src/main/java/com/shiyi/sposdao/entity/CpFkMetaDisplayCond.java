package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpFkMetaDisplayCond implements Serializable {
    private Integer id;

    private String security;

    private String code;

    private Integer metaId;

    private String name;

    private static final long serialVersionUID = 1L;
}