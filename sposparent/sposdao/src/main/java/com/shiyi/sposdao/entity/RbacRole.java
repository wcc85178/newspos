package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class RbacRole implements Serializable {
    private Integer id;

    private String security;

    private Integer enable;

    private String name;

    private static final long serialVersionUID = 1L;
}