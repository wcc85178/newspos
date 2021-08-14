package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 商户密码错误记录表
 */
@Data
public class CustomerErrPassword implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 手机号
     */
    private String tel;

    /**
     * 错误密码
     */
    private String errPassword;

    /**
     * 错误节点
     */
    private String errType;

    /**
     * 所属app
     */
    private String errAppId;

    /**
     * 错误时间
     */
    private Date errTime;

    /**
     * 请求ip
     */
    private String ip;

    private static final long serialVersionUID = 1L;
}