package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 用户微信公众号关注信息表
 */
@Data
public class CustomerSubscribe extends CustomerSubscribeKey implements Serializable {
    /**
     * 微信昵称
     */
    private String nickname;

    /**
     * 微信头像
     */
    private String headimgurl;

    private static final long serialVersionUID = 1L;
}