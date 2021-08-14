package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannelRate implements Serializable {
    private Integer id;

    /**
     * 费率如：0.5
     */
    private Double rate;

    /**
     * 提现费
     */
    private Double drawFee;

    /**
     * 是否有效 1有效0无效
     */
    private Integer enableFlag;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 备注
     */
    private String mark;

    /**
     * 创建时间
     */
    private Integer createTime;

    private static final long serialVersionUID = 1L;
}