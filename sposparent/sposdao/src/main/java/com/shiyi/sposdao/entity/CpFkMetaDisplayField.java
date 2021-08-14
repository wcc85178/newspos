package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpFkMetaDisplayField implements Serializable {
    private Integer id;

    private String security;

    private String code;

    private Integer displayposition;

    private Integer metaId;

    private String name;

    private Integer width;

    private static final long serialVersionUID = 1L;
}