package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 商户池用户mcc排序
 */
@Data
public class PayChannelCustomerOrder implements Serializable {
    private Integer id;

    private String mcc;

    private static final long serialVersionUID = 1L;
}