package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QrtzLocksKey implements Serializable {
    private String schedName;

    private String lockName;

    private static final long serialVersionUID = 1L;
}