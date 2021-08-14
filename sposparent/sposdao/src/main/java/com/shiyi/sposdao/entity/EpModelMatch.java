package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class EpModelMatch implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 厂商名称
     */
    private String factoryName;

    /**
     * 型号名称
     */
    private String modelName;

    /**
     * 型号名称扩展2
     */
    private String modelNameExt2;

    private static final long serialVersionUID = 1L;
}