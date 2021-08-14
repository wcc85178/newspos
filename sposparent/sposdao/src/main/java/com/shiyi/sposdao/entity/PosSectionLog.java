package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * POS Section pos号段表
 */
@Data
public class PosSectionLog implements Serializable {
    private Integer sectionId;

    /**
     * 起始号段
     */
    private Long sectionStart;

    /**
     * 结束号段
     */
    private Long sectionEnd;

    private Integer modelId;

    /**
     * 型号名称
     */
    private String modelName;

    private Integer factoryId;

    /**
     * 厂家名称
     */
    private String factoryName;

    /**
     * 创建时间
     */
    private Date sectionCreateTime;

    private static final long serialVersionUID = 1L;
}