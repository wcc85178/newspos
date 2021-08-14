package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 广告点击统计
 */
@Data
public class AppAdCount implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 跳转路径
     */
    private String url;

    /**
     * app类型 苹果或者安卓
     */
    private String apptype;

    /**
     * 次数-
     */
    private Integer count;

    /**
     * 日期
     */
    private String day;

    private static final long serialVersionUID = 1L;
}