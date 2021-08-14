package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PosRunningNo implements Serializable {
    private Integer id;

    private String security;

    private Integer posRunningNo;

    private Integer version;

    private Integer refPosId;

    private static final long serialVersionUID = 1L;
}