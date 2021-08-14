package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 城市跳转表
 */
@Data
public class PayChannelCityChange implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 城市A
     */
    private String citya;

    /**
     * 城市B所在的省
     */
    private String province;

    /**
     * 城市B
     */
    private String cityb;

    /**
     * 是否开启标识,1开启 0 关闭
     */
    private Integer flag;

    private static final long serialVersionUID = 1L;
}