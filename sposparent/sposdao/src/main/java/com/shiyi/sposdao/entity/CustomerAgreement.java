package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CustomerAgreement implements Serializable {
    private Integer id;

    /**
     * 商户Id
     */
    private Integer customerId;

    /**
     * 首笔扣费协议是否同意，0否，1是
     */
    private Integer agreementFlag;

    /**
     * 协议同意来源，来自终端还是app
     */
    private String agreementPlatform;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}