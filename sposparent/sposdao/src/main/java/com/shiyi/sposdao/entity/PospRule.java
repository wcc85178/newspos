package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PospRule implements Serializable {
    private Integer id;

    private String security;

    private Long createTime;

    private String operatorName;

    private Integer refConsumerId;

    private Integer refPayChannelConsumerId;

    private static final long serialVersionUID = 1L;
}