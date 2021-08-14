package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * @author 
 * 客户扣费达标记录表
 */
@Data
public class CustomerNewKpiFrozen implements Serializable {
    private Integer id;

    /**
     * 冻结金额 单位 元
     */
    private BigDecimal chargebackamount;

    /**
     * 达标开始时间
     */
    private Long pospTransDatetime;

    /**
     * 冻结金额是否已经代付，0未代付，1已代付
     */
    private Short frozenFeeFlag;

    /**
     * customer表外键
     */
    private String customerCode;

    private Integer refAgentId;

    private String security;

    private String field11;

    private String agentKoufeiFlag;

    private Short btFlag;

    private static final long serialVersionUID = 1L;
}