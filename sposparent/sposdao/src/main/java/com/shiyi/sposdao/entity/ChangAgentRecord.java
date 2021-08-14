package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class ChangAgentRecord implements Serializable {
    private Integer id;

    private String ip;

    private String editer;

    private Integer customerid;

    private Integer toagentId;

    private Date time;

    private Integer type;

    private String security;

    private String nsecurity;

    private Integer oagentid;

    private static final long serialVersionUID = 1L;
}