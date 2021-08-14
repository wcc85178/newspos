package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 机具终端号范围
 */
@Data
public class PosToTerm implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 机具号
     */
    private String sn;

    /**
     * 商户编号
     */
    private String mer;

    /**
     * 易生内部终端号
     */
    private String epTermCode;

    /**
     * 渠道商户号
     */
    private String channelMerCode;

    /**
     * 渠道终端号
     */
    private String channelTermCode;

    /**
     * 变更时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}