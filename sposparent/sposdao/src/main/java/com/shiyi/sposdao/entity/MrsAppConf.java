package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * mrp2.0参数配置表
 */
@Data
public class MrsAppConf implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 应用配置键名
     */
    private String appConfKey;

    /**
     * 应用配置键值
     */
    private String appConfVal;

    /**
     * 应用配置键值(大容量数据)
     */
    private String appConfBigVal;

    /**
     * 应用配置名
     */
    private String appConfName;

    /**
     * 应用配置前缀
     */
    private String appConfAlias;

    /**
     * 应用配置类型
     */
    private String appConfType;

    /**
     * 配置启用状态 0-禁用 1-启用
     */
    private String status;

    /**
     * 配置添加时间
     */
    private Date createTime;

    /**
     * 配置更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}