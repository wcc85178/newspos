package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class HsFtpReconciliation implements Serializable {
    private Integer id;

    private String ftpTransId;

    private String ftpMerid;

    private Integer ftpTransamt;

    private String ftpPayTime;

    private Integer ftpGetamt;

    private String ftpBankcard;

    private Integer resultCode;

    private Long worthTransamt;

    private Date worthLastUpTs;

    private String worthCardno;

    private static final long serialVersionUID = 1L;
}