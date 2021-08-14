package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * app首页模块参数配置表
 */
@Data
public class AppHomePageConfig implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 001：小蓝牙；002：大蓝牙
     */
    private String appId;

    /**
     * 模块位置 1,第一行收款 2,第二行其他功能 3,第四行 喔刷推荐 4,底部
     */
    private String moduleAddr;

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

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 400电话
     */
    private String tel;

    /**
     * 0 不需要特别标记；1:云闪付交易
     */
    private Short moduleValue;

    /**
     * 是否需要用户实名认证通过才能跳转 0 不需要,1需要
     */
    private Integer isTrueName;

    private static final long serialVersionUID = 1L;
}