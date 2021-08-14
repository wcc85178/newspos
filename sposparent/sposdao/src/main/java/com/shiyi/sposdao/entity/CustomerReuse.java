package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 商户重开发
 */
@Data
public class CustomerReuse implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 商户id
     */
    private Integer customerId;

    /**
     * mer
     */
    private String mer;

    /**
     * 代理关系
     */
    private String security;

    /**
     * 审核标记
     */
    private Integer auditFlag;

    private String consumerAddr;

    /**
     * 禁用
     */
    private Integer enableFlag;

    /**
     * 0：做过交易，道合首笔补贴0；1：没有做过交易的当做新用户，道合首笔补贴50
     */
    private String imgHandIdCard;

    /**
     * 沉默来源。1,2喔刷，3,4易多付，5,6壹生付，7,8壹pos
     */
    private String imgIdCardDown;

    /**
     * 身份证正面
     */
    private String imgIdCardUp;

    /**
     * 身份证号
     */
    private String manIdCard;

    /**
     * 姓名
     */
    private String manName;

    /**
     * 手机号
     */
    private String manTel;

    /**
     * 所属id
     */
    private Integer refAgentId;

    /**
     * 激活时间
     */
    private Long activetime;

    /**
     * 平台
     */
    private String platform;

    /**
     * 0 未扣款 1 已扣款
     */
    private String chargebackdone;

    /**
     * sppid
     */
    private Integer accountid;

    /**
     * 所属政策
     */
    private String lastPolicy;

    /**
     * 开始时间
     */
    private String startDay;

    /**
     * 结束时间
     */
    private String endDay;

    /**
     * 重开发机构
     */
    private Integer nextAgentId;

    /**
     * 备注
     */
    private String mark;

    /**
     * 重开发时间
     */
    private Long createTime;

    private static final long serialVersionUID = 1L;
}