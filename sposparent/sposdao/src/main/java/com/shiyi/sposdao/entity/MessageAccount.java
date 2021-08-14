package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * APP账户消息表
 */
@Data
public class MessageAccount implements Serializable {
    private Integer id;

    /**
     * 001:小蓝牙，002：大蓝牙
     */
    private String appId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户手机号码
     */
    private String userTel;

    /**
     * 消息标题
     */
    private String title;

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