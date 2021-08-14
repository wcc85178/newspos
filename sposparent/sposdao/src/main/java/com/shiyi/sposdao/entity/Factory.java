package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 终端厂家表
 */
@Data
public class Factory implements Serializable {
    /**
     * 主键id
     */
    private Byte factoryId;

    /**
     * 平台分配的厂家编号
     */
    private String appid;

    /**
     * 厂家名称
     */
    private String factoryName;

    /**
     * 厂家公司全名
     */
    private String factoryCompanyName;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系人手机
     */
    private Long phone;

    /**
     * 传输密钥机密机索引
     */
    private String protectKeyIndex;

    /**
     * 传输密钥明文
     */
    private String protectKey;

    /**
     * 分配号段
     */
    private String factorySection;

    private static final long serialVersionUID = 1L;
}