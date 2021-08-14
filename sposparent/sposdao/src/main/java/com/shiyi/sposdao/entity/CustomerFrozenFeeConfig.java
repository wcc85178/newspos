package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 客户达标系统参数配置表
 */
@Data
public class CustomerFrozenFeeConfig implements Serializable {
    private Integer id;

    /**
     * 冻结金额
     */
    private BigDecimal defaultFrozenFee;

    /**
     * 全局开通状态，0：局部开通，1：全局开通
     */
    private Short openFlag;

    /**
     * 开通达标需求的代理商ID,用,隔开
     */
    private String agentIdList;

    /**
     * 默认达标金额
     */
    private BigDecimal defaultDabiaoAmt;

    /**
     * 默认达标跨度月份
     */
    private Short defaultDabiaoMonth;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}