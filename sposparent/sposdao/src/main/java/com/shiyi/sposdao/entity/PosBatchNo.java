package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PosBatchNo implements Serializable {
    private Integer id;

    private String security;

    private Integer batchNo;

    private String updateTime;

    private Integer refPosId;

    private static final long serialVersionUID = 1L;
}