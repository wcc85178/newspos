package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 请求易生操作记录表
 */
@Data
public class MrsEpOperaRecord implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 报文类型
     */
    private String messageType;

    /**
     * 易生商户唯一标识	
     */
    private String merTrace;

    /**
     * 操作流水号
     */
    private String operaTrace;

    /**
     * 代理侧请求流水号
     */
    private String reqTrace;

    /**
     * 下游回调地址
     */
    private String backUrl;

    /**
     * 审核状态 0-审核中 1-审核成功 2-审核失败
     */
    private String auditStatus;

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