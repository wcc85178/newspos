package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * app版本控制
 */
@Data
public class AppVersion implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 状态
     */
    private String state;

    /**
     * 001：小蓝牙；002：大蓝牙 003 电签
     */
    private String appId;

    /**
     * 版本升级描述
     */
    private String versionDesc;

    /**
     * 版本号
     */
    private String version;

    /**
     * app平台：ios , android 
     */
    private String platform;

    /**
     * 手机操作系统版本
     */
    private String platformVersioin;

    /**
     * Y：表示强制升级  N：表示非强制升级
     */
    private String updateFlag;

    /**
     * 应用包下载地址url
     */
    private String updateUrl;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 下载平台
     */
    private String appDownPlatform;

    /**
     * expirationDate 检查入口 1是为了ios 特制
     */
    private String forIos;

    /**
     * 有效期(应用取相反值)
     */
    private String expirationdate;

    private static final long serialVersionUID = 1L;
}