package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QrtzJobDetailsKey implements Serializable {
    private String schedName;

    private String jobName;

    private String jobGroup;

    private static final long serialVersionUID = 1L;
}