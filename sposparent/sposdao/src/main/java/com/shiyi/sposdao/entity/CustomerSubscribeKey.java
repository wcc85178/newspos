package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 用户微信公众号关注信息表
 */
@Data
public class CustomerSubscribeKey implements Serializable {
    private Integer id;

    /**
     * 普通用户的标识，对当前应用下帐号唯一
     */
    private String openid;

    /**
     * 联合id,对当前开发者帐号唯一
     */
    private String unionid;

    private static final long serialVersionUID = 1L;
}