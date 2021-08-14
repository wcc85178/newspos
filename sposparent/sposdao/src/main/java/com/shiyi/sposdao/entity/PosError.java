package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PosError implements Serializable {
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 机身号
     */
    private String ksn;

    /**
     * 错误信息
     */
    private String error;

    /**
     * 用户手机号
     */
    private String tel;

    /**
     * app 苹果/安卓
     */
    private String apptype;

    /**
     * 版本
     */
    private String version;

    /**
     * 手机操作系统版本
     */
    private String mobileversion;

    /**
     * 生产号段
     */
    private String sectionId;

    /**
     * 型号
     */
    private String modelName;

    /**
     * 厂家
     */
    private String factoryName;

    /**
     * json体机具其他信息
     */
    private String remarkjson;

    private String appDownPlatform;

    private String appId;

    private static final long serialVersionUID = 1L;
}