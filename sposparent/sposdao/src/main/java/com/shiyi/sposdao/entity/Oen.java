package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Oen implements Serializable {
    private Integer id;

    private String security;

    private Integer auditFlag;

    private String bohuiMark;

    private Long createTime;

    private Integer enableFlag;

    private String manIdCard;

    private String manName;

    private String name;

    private String operatorName;

    private Integer parentId;

    private Integer parentType;

    private String password;

    private String username;

    private static final long serialVersionUID = 1L;
}