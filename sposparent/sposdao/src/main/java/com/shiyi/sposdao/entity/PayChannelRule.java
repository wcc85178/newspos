package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * mcc金额限制表
 */
@Data
public class PayChannelRule implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * mcc
     */
    private String mcc;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 金额
     */
    private Double amountStart;

    /**
     * 金额
     */
    private Double amountEnd;

    /**
     * 0 标准 1 非标准
     */
    private String feibiaoFlag;

    private static final long serialVersionUID = 1L;
}