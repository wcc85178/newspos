package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * app系统参数配置表
 */
@Data
public class AppSysConfig implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 参数名
     */
    private String sysConfName;

    /**
     * 参数值
     */
    private String descr;

    /**
     * 参数
     */
    private String note;

    /**
     * 参数1
     */
    private String note1;

    /**
     * 参数2
     */
    private String note2;

    /**
     * 参数3
     */
    private String note3;

    private Byte status;

    /**
     * 参数4
     */
    private String note4;

    private static final long serialVersionUID = 1L;
}