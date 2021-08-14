package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 用户表
 */
@Data
public class CustomerKey implements Serializable {
    /**
     * 商户主键id
     */
    private Integer id;

    /**
     * 龙川注册使用(意义不明) 正常为100010000  异常 100010001
     */
    private Integer endFlag;

    private static final long serialVersionUID = 1L;
}