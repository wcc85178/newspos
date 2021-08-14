package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannelCustomerKeys implements Serializable {
    private Integer id;

    private String security;

    private String zak;

    private String zmk;

    private String zpk;

    private Integer refPayChannelConsumerId;

    private static final long serialVersionUID = 1L;
}