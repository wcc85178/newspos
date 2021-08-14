package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Operationlog implements Serializable {
    private Integer id;

    private String userid;

    private String username;

    private Date createtime;

    private String loglevel;

    private String logmessage;

    private static final long serialVersionUID = 1L;
}