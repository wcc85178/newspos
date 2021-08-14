package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 交易费率配置表
 */
@Data
public class CustomerTwoRateConfig implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 交易备注
     */
    private String mark;

    /**
     * 交易码
     */
    private String transCode;

    /**
     * 交易类型
     */
    private String transType;

    /**
     * 费率
     */
    private String rate;

    /**
     * 手续费
     */
    private String counterFee;

    private static final long serialVersionUID = 1L;
}