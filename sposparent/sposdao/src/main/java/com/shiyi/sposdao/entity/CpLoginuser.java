package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpLoginuser implements Serializable {
    private Integer id;

    private String security;

    private String addSecurity;

    private String name;

    private String password;

    private Integer uid;

    private Integer userType;

    private String username;

    private Integer enableFlag;

    private String manname;

    private Integer enable;

    private static final long serialVersionUID = 1L;
}