package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class QrtzJobDetails extends QrtzJobDetailsKey implements Serializable {
    private String description;

    private String jobClassName;

    private String isDurable;

    private String isNonconcurrent;

    private String isUpdateData;

    private String requestsRecovery;

    private byte[] jobData;

    private static final long serialVersionUID = 1L;
}