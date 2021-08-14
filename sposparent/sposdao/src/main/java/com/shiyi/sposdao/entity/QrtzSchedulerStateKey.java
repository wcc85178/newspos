package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QrtzSchedulerStateKey implements Serializable {
    private String schedName;

    private String instanceName;

    private static final long serialVersionUID = 1L;
}