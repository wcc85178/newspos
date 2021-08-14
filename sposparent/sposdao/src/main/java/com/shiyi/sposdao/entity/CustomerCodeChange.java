package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 用户手机号变更表
 */
@Data
public class CustomerCodeChange implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer customerId;

    /**
     * 变更前手机号
     */
    private String oldTel;

    /**
     * 变更后手机号
     */
    private String newTel;

    /**
     * 操作人
     */
    private String operator;

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