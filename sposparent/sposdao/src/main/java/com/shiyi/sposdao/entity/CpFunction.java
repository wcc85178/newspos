package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpFunction implements Serializable {
    private Integer id;

    private String security;

    private String domainName;

    private String entityName;

    private String filterSql;

    private Integer generatorPojo;

    private String name;

    private String sortDescField;

    private String sortFieldName;

    private String sortName;

    private String tableName;

    private String url;

    private Integer used;

    private String refFilterSql;

    private Integer sort;

    private Integer fitable;

    private static final long serialVersionUID = 1L;
}