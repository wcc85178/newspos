package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CardAuthConfig implements Serializable {
    private Integer id;

    private String payCode;

    private String tureNameCode;

    private Integer agentId;

    private Date update;

    private static final long serialVersionUID = 1L;
}