package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class ErrPic implements Serializable {
    /**
     * 流水号
     */
    private Integer id;

    /**
     * 交易号
     */
    private Integer transId;

    private String picUrl;

    /**
     * 类型
     */
    private Integer picType;

    /**
     * 是否有效
     */
    private Integer isValid;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建人
     */
    private String createBy;

    private Integer fromType;

    /**
     * 签过单
     */
    private String signPic;

    private static final long serialVersionUID = 1L;
}