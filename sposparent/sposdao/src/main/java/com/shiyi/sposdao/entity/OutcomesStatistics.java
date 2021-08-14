package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 运营数据统计表
 */
@Data
public class OutcomesStatistics implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 日期
     */
    private String transDate;

    /**
     * 日活
     */
    private Integer dau;

    /**
     * 日新增注册用户
     */
    private Integer dayNewCustomer;

    /**
     * 日交易额
     */
    private String dayTransAmount;

    /**
     * 日交易笔数
     */
    private Integer dayTransCount;

    /**
     * 总注册数
     */
    private Integer totalRegisters;

    /**
     * 总实名认证数
     */
    private Integer totalAutoym;

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