package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * app模块参数配置表
 */
@Data
public class AppConfig implements Serializable {
    private Integer id;

    /**
     * 001：小蓝牙；002：大蓝牙
     */
    private String appId;

    /**
     * 模块编号
     */
    private String moduleCode;

    /**
     * local/h5
     */
    private String moduleType;

    /**
     * 模块名称
     */
    private String moduleName;

    /**
     * 模块请求url
     */
    private String moduleUrl;

    /**
     * 图标url
     */
    private String moduleImgUrl;

    /**
     * 描述
     */
    private String descr;

    private Date createTime;

    /**
     * 400电话
     */
    private String tel;

    /**
     * 0 不需要特别标记；1:云闪付交易
     */
    private Short moduleValue;

    private static final long serialVersionUID = 1L;
}