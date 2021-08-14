package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * mcc优先级表
 */
@Data
public class PayChannelCustomerRankRule implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * mcc吗
     */
    private String mcc;

    /**
     * 优先级,越大越高，最高99999
     */
    private Integer rank;

    /**
     * 最大额度(分)
     */
    private BigDecimal maxline;

    /**
     * 状态 0 关闭 1 启用
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}