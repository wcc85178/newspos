package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 时间段mcc选取表
 */
@Data
public class PayChannelMccChoose implements Serializable {
    private Integer id;

    /**
     * 规则起始时间
     */
    private Integer startTime;

    /**
     * 规则终止时间
     */
    private Integer endTime;

    /**
     * 主选mcc
     */
    private String mainMcc;

    /**
     * 备选可选mcc
     */
    private String backupMcc;

    /**
     * 备选不可选mcc
     */
    private String backupNotMcc;

    /**
     * 是否启用
     */
    private Integer flag;

    private static final long serialVersionUID = 1L;
}