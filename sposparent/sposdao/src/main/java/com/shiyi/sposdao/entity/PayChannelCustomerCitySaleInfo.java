package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PayChannelCustomerCitySaleInfo implements Serializable {
    private Integer id;

    /**
     * 日期（yyyymmdd）
     */
    private String date;

    /**
     * 城市的MD5
     */
    private String cityMd5;

    /**
     * 城市名
     */
    private String city;

    /**
     * 当前城市当天成功消费总笔数
     */
    private Integer totalNum;

    /**
     * 当前城市当天非标成功消费总笔数
     */
    private Integer totalFeibiaoNum;

    private static final long serialVersionUID = 1L;
}