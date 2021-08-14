package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class RbacRoleUser implements Serializable {
    private Integer id;

    private String security;

    private Integer roleId;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}