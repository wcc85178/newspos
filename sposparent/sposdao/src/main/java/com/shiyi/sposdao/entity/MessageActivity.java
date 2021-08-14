package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * APP活动消息表
 */
@Data
public class MessageActivity implements Serializable {
    private Integer id;

    /**
     * 001:小蓝牙，002：大蓝牙
     */
    private String appId;

    /**
     * 消息标题
     */
    private String title;

    /**
     * 图片url
     */
    private String imgUrl;

    /**
     * 点击之后的跳转路径
     */
    private String imgH5Url;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 消息创建人员
     */
    private String operatorName;

    /**
     * 消息内容
     */
    private String content;

    private static final long serialVersionUID = 1L;
}