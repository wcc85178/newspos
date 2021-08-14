package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpAdminAccount implements Serializable {
    private Integer id;

    private String security;

    private String name;

    private String password;

    private String username;

    private Integer enableFlag;

    private static final long serialVersionUID = 1L;
}