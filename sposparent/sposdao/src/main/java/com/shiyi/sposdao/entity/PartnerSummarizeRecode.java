package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PartnerSummarizeRecode implements Serializable {
    private Integer id;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 交易码
     */
    private String trancde;

    /**
     * 进账
     */
    private Integer inAccountId;

    /**
     * 出账账号
     */
    private Integer outAccountId;

    /**
     * 来源
     */
    private String fromType;

    /**
     * 订单号
     */
    private String billId;

    /**
     * 金额
     */
    private BigDecimal amt;

    /**
     * 结果描述
     */
    private String result;

    /**
     * 应答码
     */
    private String resultCode;

    private static final long serialVersionUID = 1L;
}