package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CustomerClientkey implements Serializable {
    private Integer id;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    private String manIdCard;

    private String manName;

    private String manTel;

    private String serial;

    /**
     * 有效状态:1 有效; 0 无效
     */
    private Byte status;

    /**
     * 密码
     */
    private String mps;

    private String prikey;

    private static final long serialVersionUID = 1L;
}