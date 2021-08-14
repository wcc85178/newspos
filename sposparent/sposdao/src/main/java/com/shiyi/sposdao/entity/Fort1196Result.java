package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 120退款文件记录
 */
@Data
public class Fort1196Result implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 0未使用
     */
    private Integer countbefore;

    /**
     * 0未使用
     */
    private String sumbefore;

    /**
     * 文件地址
     */
    private String url;

    /**
     * 日期
     */
    private String day;

    /**
     * 未使用
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 笔数
     */
    private Integer countafter;

    /**
     * 总金额
     */
    private String sumafter;

    /**
     * 新文件地址
     */
    private String newUrl;

    private static final long serialVersionUID = 1L;
}