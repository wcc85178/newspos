package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 商户标签表
 */
@Data
public class CustomerTags implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer refCustomerId;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 星座
     */
    private Integer constellation;

    /**
     * 地区
     */
    private Integer area;

    /**
     * 操作系统
     */
    private Integer os;

    /**
     * 交易地区
     */
    private Integer tradeArea;

    /**
     * 活跃情况
     */
    private Integer activity;

    /**
     * 营业额
     */
    private Integer turnover;

    /**
     * 受理卡类别
     */
    private String recCardCategory;

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