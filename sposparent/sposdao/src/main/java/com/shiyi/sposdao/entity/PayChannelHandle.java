package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannelHandle implements Serializable {
    private Integer id;

    /**
     * 卡bin
     */
    private String cardprefixnum;

    /**
     * 状态:1 启用  0 停用
     */
    private Byte status;

    private String appId;

    private static final long serialVersionUID = 1L;
}