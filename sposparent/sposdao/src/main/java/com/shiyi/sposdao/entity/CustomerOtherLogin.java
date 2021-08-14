package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 用户其他登陆方式表
 */
@Data
public class CustomerOtherLogin implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * customer表id
     */
    private Integer customerId;

    /**
     * 普通用户的标识，对当前应用下帐号唯一
     */
    private String openid;

    /**
     * 联合id,对当前开发者帐号唯一
     */
    private String unionid;

    /**
     * 微信昵称
     */
    private String nickname;

    /**
     * 微信头像
     */
    private String headimgurl;

    /**
     * 指纹id,app上送的唯一id,当用户关闭时清空该字段
     */
    private String fingerId;

    /**
     * 系统产生的指纹登录key,当用户关闭时清空该字段
     */
    private String fingerKey;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 苹果id
     */
    private String appleId;

    private static final long serialVersionUID = 1L;
}