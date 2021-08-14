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
public class ChannelMerInfo implements Serializable {
    private Integer chid;

    private String chname;

    private String chmerid;

    private String chtermid;

    private String chseriid;

    private String chbatchid;

    private String chtermseqid;

    private Short chstat;

    private Short chtype;

    private Integer chaddid;

    private Short chfeeid;

    private Integer orgcode;

    private Integer provid;

    private String chzmk;

    private String chzpk;

    private String chzak;

    private String chzek;

    private String chenckey;

    private Date opendate;

    private BigDecimal transamtpool;

    private Date lastupdts;

    private String oprid;

    private static final long serialVersionUID = 1L;
}