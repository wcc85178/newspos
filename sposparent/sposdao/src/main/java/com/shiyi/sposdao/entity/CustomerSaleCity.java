package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 商户消费地址白名单
 */
@Data
public class CustomerSaleCity implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 商户编号
     */
    private String customerId;

    /**
     * 省
     */
    private String province;

    /**
     * 地级市
     */
    private String city;

    /**
     * 是否启用,0 不启用 1启用,默认1
     */
    private Byte flag;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}