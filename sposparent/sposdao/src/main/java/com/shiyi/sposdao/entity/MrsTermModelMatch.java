package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 终端模型对照
 */
@Data
public class MrsTermModelMatch implements Serializable {
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
     * 易生型号对应id
     */
    private String epModelId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}