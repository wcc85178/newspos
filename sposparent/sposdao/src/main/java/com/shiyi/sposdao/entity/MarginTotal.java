package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class MarginTotal implements Serializable {
    private Integer id;

    private Integer refAgentId;

    private Integer marginNum;

    private Integer trNum;

    private Integer t1TrNum;

    private Integer t1MarginNum;

    private static final long serialVersionUID = 1L;
}