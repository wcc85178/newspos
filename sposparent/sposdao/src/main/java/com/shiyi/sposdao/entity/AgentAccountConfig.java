package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class AgentAccountConfig implements Serializable {
    private Integer id;

    private Integer agentId;

    /**
     * 提现费
     */
    private Integer drawFee;

    private String parentId;

    private String security;

    private Integer agentAccountid;

    private Date createtime;

    private static final long serialVersionUID = 1L;
}