package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class MqReceiveAdd implements Serializable {
    private Integer id;

    /**
     * 接收次数
     */
    private Integer num;

    /**
     * 内容
     */
    private String content;

    /**
     * 订单号
     */
    private String field11;

    /**
     * 队列名称
     */
    private String queuekey;

    private Date time;

    /**
     * 0 不需要重跑 1 需要重跑  2 已经重跑
     */
    private Short reflag;

    private static final long serialVersionUID = 1L;
}