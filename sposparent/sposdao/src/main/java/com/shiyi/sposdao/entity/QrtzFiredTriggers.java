package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QrtzFiredTriggers extends QrtzFiredTriggersKey implements Serializable {
    private String triggerName;

    private String triggerGroup;

    private String instanceName;

    private Long firedTime;

    private Long schedTime;

    private Integer priority;

    private String state;

    private String jobName;

    private String jobGroup;

    private String isNonconcurrent;

    private String requestsRecovery;

    private static final long serialVersionUID = 1L;
}