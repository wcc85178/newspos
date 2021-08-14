package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class ApplyPay implements Serializable {
    private Integer id;

    /**
     * 流水号ID
     */
    private String transId;

    /**
     * 图片URL
     */
    private String picUrl;

    /**
     * 图片类型
     */
    private Integer picType;

    /**
     * 处理结果
     */
    private String handDesp;

    /**
     * 是否有效 0无效1有效
     */
    private Integer enableFlag;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 创建人
     */
    private String createBy;

    private Long checkTime;

    private static final long serialVersionUID = 1L;
}