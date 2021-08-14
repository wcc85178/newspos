package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannelCustomerCheck implements Serializable {
    private Integer id;

    private String pos;

    private String tel;

    /**
     * 商户号
     */
    private String code;

    /**
     * 状态 1 启用 2 停用
     */
    private Byte status;

    private String name;

    private static final long serialVersionUID = 1L;
}