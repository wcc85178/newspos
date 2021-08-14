package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class RbacRoleEnableButton implements Serializable {
    private Integer id;

    private String security;

    private String buttonCode;

    private Integer funId;

    private Integer roleId;

    private static final long serialVersionUID = 1L;
}