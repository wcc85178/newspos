package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 信息表
 */
@Data
public class Message implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 所属app  003
     */
    private String appId;

    /**
     * 安全
     */
    private String security;

    /**
     * 创建时间
     */
    private Long createTime;

    private Integer messageFlag;

    /**
     * 操作人
     */
    private String operatorName;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    private static final long serialVersionUID = 1L;
}