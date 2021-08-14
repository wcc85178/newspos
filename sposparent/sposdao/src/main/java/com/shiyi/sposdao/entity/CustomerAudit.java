package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 后台人工审核表
 */
@Data
public class CustomerAudit implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 手机号码
     */
    private String code;

    /**
     * 审核状态
     */
    private String auditFlag;

    /**
     * 姓名
     */
    private String manName;

    /**
     * 所属代理
     */
    private Integer refAgentId;

    /**
     * 申请提交时间
     */
    private Long applyAuthTime;

    /**
     * 身份证号
     */
    private String manIdCard;

    /**
     * 审核人
     */
    private String editer;

    /**
     * 审核时间
     */
    private Date editerTime;

    /**
     * 未使用
     */
    private String hash;

    private static final long serialVersionUID = 1L;
}