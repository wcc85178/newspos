package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CustomerNoTrans implements Serializable {
    private Integer id;

    private String security;

    private String code;

    private String name;

    private Integer refAgentId;

    private Short type;

    private String agentName;

    private String topAgent;

    private Double amount;

    private String manIdCard;

    private Byte status;

    private Long standTime;

    private static final long serialVersionUID = 1L;
}