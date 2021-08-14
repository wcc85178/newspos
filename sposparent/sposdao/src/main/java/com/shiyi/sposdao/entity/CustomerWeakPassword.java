package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 弱密码
 */
@Data
public class CustomerWeakPassword implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 弱密码
     */
    private String password;

    private static final long serialVersionUID = 1L;
}