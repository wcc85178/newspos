package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 广告
 */
@Data
public class Advertisement implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 广告名称
     */
    private String adName;

    /**
     * 推送客户端:0表示 都推送,1表示只推送安卓客户端,2表示只推送苹果客户端
     */
    private Integer platformId;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 跳转地址
     */
    private String h5Url;

    /**
     * 广告位置:1开机广告,2首页广告,3 收款成功广告,4 banner
     */
    private Integer type;

    /**
     * 广告开始时间
     */
    private Date startTime;

    /**
     * 广告结束时间
     */
    private Date endTime;

    /**
     * 广告创建时间
     */
    private Date createTime;

    /**
     * 广告更新时间
     */
    private Date updateTime;

    /**
     * 轮播时间
     */
    private Integer turnTime;

    /**
     * 状态：1表示开启   0表示不开启
     */
    private String state;

    /**
     * 广告标签
     */
    private String tags;

    /**
     * 是否通用 0是不通用，1是通用
     */
    private Integer isGlobal;

    /**
     * 是否需要用户实名认证通过才能跳转 0 不需要,1需要
     */
    private Integer isTrueName;

    /**
     * 模块编号,同app_home_page_config表里的
     */
    private String moduleCode;

    private static final long serialVersionUID = 1L;
}