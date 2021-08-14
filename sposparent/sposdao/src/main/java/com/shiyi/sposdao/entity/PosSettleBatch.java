package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PosSettleBatch implements Serializable {
    private Integer id;

    private String security;

    private String batchNo;

    private Long createTime;

    private String customerCode;

    private String posNo;

    private Integer runningCheckFlag;

    private Integer settleFlag;

    private static final long serialVersionUID = 1L;
}