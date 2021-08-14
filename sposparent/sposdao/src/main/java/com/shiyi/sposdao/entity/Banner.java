package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * banner展示图
 */
@Data
public class Banner implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 003 电签
     */
    private String appId;

    /**
     * 标题
     */
    private String title;

    /**
     * 状态：1表示开启   0表示不开启
     */
    private String state;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 位置
     */
    private String imgIndex;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * H5跳转地址
     */
    private String h5Url;

    /**
     * 图片跳转地址
     */
    private String imgH5Url;

    /**
     * 轮播时间
     */
    private Integer turnTime;

    private static final long serialVersionUID = 1L;
}