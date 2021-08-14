package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannelHandleWhe implements Serializable {
    private Integer id;

    /**
     * 白名单卡号
     */
    private String cardno;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}