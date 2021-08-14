package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class ChannelAddInfo implements Serializable {
    private Integer chaddid;

    private String chname;

    private String chhost;

    private String chport;

    private String chtpdu;

    private String chheader;

    private String chorgno;

    private String chorgkey;

    private Short chstat;

    private Date opendate;

    private Date lastupdts;

    private String chshortname;

    private static final long serialVersionUID = 1L;
}