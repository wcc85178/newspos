package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 禁止入网地区
 */
@Data
public class ForbiddenArea implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 禁止省份
     */
    private String forbiddenProvince;

    /**
     * 禁止城市
     */
    private String forbiddenCity;

    /**
     * 身份证前缀
     */
    private String idCardPrefix;

    /**
     * 状态 0 不启用 1 启用
     */
    private Integer state;

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