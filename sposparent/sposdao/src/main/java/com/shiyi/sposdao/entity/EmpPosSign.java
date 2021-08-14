package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class EmpPosSign implements Serializable {
    private Integer id;

    private String content;

    private Date createtime;

    private String tel;

    private static final long serialVersionUID = 1L;
}