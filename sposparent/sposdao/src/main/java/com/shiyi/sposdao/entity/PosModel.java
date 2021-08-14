package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * pos型号表
 */
@Data
public class PosModel implements Serializable {
    private Integer modelId;

    /**
     * 型号名称
     */
    private String modelName;

    /**
     * 1:小蓝牙，2：mpos,3:电签POS
     */
    private Integer modelType;

    /**
     * 小蓝牙,mpos,电签POS
     */
    private String modelTypeName;

    /**
     * 号段
     */
    private String modelSection;

    private Integer factoryId;

    private static final long serialVersionUID = 1L;
}