package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannelCustomerAutomccCity implements Serializable {
    private Integer id;

    private String province;

    private String city;

    private String flag;

    private static final long serialVersionUID = 1L;
}