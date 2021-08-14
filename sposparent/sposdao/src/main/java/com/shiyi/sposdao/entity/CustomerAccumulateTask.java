package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 用户积分任务交易推送配置表
 */
@Data
public class CustomerAccumulateTask implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * customer表id
     */
    private Integer customerId;

    /**
     * 请求编号
     */
    private String reqNo;

    /**
     * 监听交易类型
T_T0 监听T0交易
T_T1 监听T1交易
T_ALL 监听所有交易
     */
    private String tradeListener;

    /**
     * 监听交易卡类型
CC 监听信用卡交易
DC 监听贷记卡交易
ALL 监听所有交易
     */
    private String cardType;

    /**
     * mq推送开始时间
     */
    private Date joinTime;

    /**
     * mq推送结束时间
     */
    private Date endTime;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}