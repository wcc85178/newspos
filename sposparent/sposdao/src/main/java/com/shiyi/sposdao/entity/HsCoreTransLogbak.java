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
public class HsCoreTransLogbak implements Serializable {
    private Long translogid;

    private String inttxndt;

    private String inttxntm;

    private String chtxndt;

    private String chtxntm;

    private String transsource;

    private String transtype;

    private String msgtypeid;

    private String tradecode;

    private String servercode;

    private String servertypecode;

    private String cardserino;

    private String trackingno;

    private String origtrackingno;

    private String referenceno;

    private String merid;

    private String termid;

    private String orgno;

    private String agentno;

    private String batchid;

    private String chmerid;

    private String chtermid;

    private String chbatchid;

    private String chtrackingno;

    private String settledt;

    private BigDecimal transamt;

    private String cardno;

    private String authno;

    private String userdefine60;

    private String issno;

    private String acqno;

    private String expiredt;

    private Short transstat;

    private Short cancelstat;

    private Integer chaddid;

    private String replycd;

    private Short checkstatus;

    private String cardtypeflag;

    private String dcdata;

    private BigDecimal merchantfee;

    private BigDecimal merchantsettle;

    private BigDecimal orgsettle;

    private BigDecimal channelsettle;

    private Date lastupdts;

    private static final long serialVersionUID = 1L;
}