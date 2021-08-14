package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayConfig implements Serializable {
    private Integer id;

    /**
     * 1 启用 (   置换为07 ) 0 不启用
     */
    private String f55Flag;

    /**
     * 0 不启用 1 启用 
     */
    private String f22Flag;

    /**
     * 22 域 输入值 
     */
    private String f22Vue;

    private Integer amount;

    private static final long serialVersionUID = 1L;
}