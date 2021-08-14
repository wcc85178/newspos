package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QrtzSimpropTriggersKey implements Serializable {
    private String schedName;

    private String triggerName;

    private String triggerGroup;

    private static final long serialVersionUID = 1L;
}