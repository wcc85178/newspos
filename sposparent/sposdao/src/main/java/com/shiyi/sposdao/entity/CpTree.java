package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpTree implements Serializable {
    private Integer id;

    private String security;

    private String iconcls;

    private String text;

    private Integer parentId;

    private static final long serialVersionUID = 1L;
}