package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpModule implements Serializable {
    private Integer id;

    private String security;

    private String modulename;

    private Integer sort;

    private static final long serialVersionUID = 1L;
}