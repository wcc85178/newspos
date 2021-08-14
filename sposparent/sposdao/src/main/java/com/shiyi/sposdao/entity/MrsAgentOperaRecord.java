package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 下游请求操作记录表
 */
@Data
public class MrsAgentOperaRecord implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 下游对应id
     */
    private Integer agentId;

    /**
     * 报文类型
     */
    private String messageType;

    /**
     * 操作序列号
     */
    private String operaTrace;

    /**
     * 下游回调地址
     */
    private String backUrl;

    /**
     * 处理状态 0-处理中 1-处理成功 2-处理失败
     */
    private String status;

    /**
     * 下游同步状态
     */
    private String asyncStatus;

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