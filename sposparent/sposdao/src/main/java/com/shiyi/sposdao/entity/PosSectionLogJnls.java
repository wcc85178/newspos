package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * pos 序列号段表
 */
@Data
public class PosSectionLogJnls implements Serializable {
    private String ksn;

    /**
     * 终端密钥
     */
    private String tmk;

    /**
     * 密钥校验值
     */
    private String tmkCheckvalue;

    /**
     * 创建时间
     */
    private Date sectionCreateTime;

    private Integer sectionId;

    private static final long serialVersionUID = 1L;
}