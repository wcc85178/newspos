package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QrtzSchedulerState extends QrtzSchedulerStateKey implements Serializable {
    private Long lastCheckinTime;

    private Long checkinInterval;

    private static final long serialVersionUID = 1L;
}