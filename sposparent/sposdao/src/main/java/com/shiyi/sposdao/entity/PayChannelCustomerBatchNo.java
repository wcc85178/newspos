package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannelCustomerBatchNo implements Serializable {
    private Integer id;

    private String security;

    private String batchNo;

    private Integer version;

    private Integer refPayChannelConsumerId;

    private static final long serialVersionUID = 1L;
}