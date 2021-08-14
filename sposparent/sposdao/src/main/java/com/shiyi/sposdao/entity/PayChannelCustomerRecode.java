package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannelCustomerRecode implements Serializable {
    private Integer id;

    private String province;

    private String city;

    private Integer count;

    private String allm;

    private String availm;

    private String percent;

    private String day;

    private Date createtime;

    private String type;

    /**
     * 商户拓展方 1 上海实壹 2 浙江喔刷
     */
    private Byte orgflag;

    private static final long serialVersionUID = 1L;
}