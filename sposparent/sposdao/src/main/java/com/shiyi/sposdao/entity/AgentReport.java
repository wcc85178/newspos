package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class AgentReport implements Serializable {
    private Integer id;

    private String security;

    private static final long serialVersionUID = 1L;
}