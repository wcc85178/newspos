package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class ChannelFeeType implements Serializable {
    private Short chfeeid;

    private Short feetype;

    private String feetypename;

    private BigDecimal feerate;

    private BigDecimal topfee;

    private Date lastupdts;

    private static final long serialVersionUID = 1L;
}