package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PosKeys implements Serializable {
    private Integer id;

    private String security;

    private String tak;

    private String tmk;

    private String tpk;

    private Long updateTime;

    private Integer refPosId;

    private static final long serialVersionUID = 1L;
}