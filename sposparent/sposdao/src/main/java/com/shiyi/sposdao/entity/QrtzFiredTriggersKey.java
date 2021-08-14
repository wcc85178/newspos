package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QrtzFiredTriggersKey implements Serializable {
    private String schedName;

    private String entryId;

    private static final long serialVersionUID = 1L;
}