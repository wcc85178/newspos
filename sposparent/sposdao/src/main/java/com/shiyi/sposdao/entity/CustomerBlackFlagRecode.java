package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CustomerBlackFlagRecode implements Serializable {
    private Integer id;

    private String ip;

    private String editer;

    private String dataIds;

    private String blackFlag;

    private String mark;

    private Date time;

    private static final long serialVersionUID = 1L;
}