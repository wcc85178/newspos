package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PosAgentMapping implements Serializable {
    private Integer id;

    private String security;

    private Long createTime;

    private String operatorName;

    private String saleSlipImg;

    private Integer refAgentId;

    private Integer posId;

    private String snCode;

    private static final long serialVersionUID = 1L;
}