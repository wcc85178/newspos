package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Partnerposdownresult implements Serializable {
    private Integer id;

    private Date createtime;

    private String ordertype;

    private String orderid;

    private String rs;

    private static final long serialVersionUID = 1L;
}