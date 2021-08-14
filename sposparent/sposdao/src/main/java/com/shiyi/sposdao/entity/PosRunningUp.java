package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PosRunningUp implements Serializable {
    private Integer id;

    private String security;

    private String amount;

    private String batchNo;

    private String cardNo;

    private String customerCode;

    private String onlyDateStr;

    private String posNo;

    private String runningNo;

    private Integer settleFlag;

    private static final long serialVersionUID = 1L;
}