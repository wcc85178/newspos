package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 扫码支付渠道
 */
@Data
public class QrPayChannel implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 渠道名称
     */
    private String channelName;

    /**
     * 启用状态 0-禁用 1-启用
     */
    private String status;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}