package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class AgentBankCard implements Serializable {
    private Integer id;

    private String bankCardCode;

    private String bankCardName;

    private Integer refAgentId;

    private String blackFlag;

    private Date createTime;

    private String manIdCard;

    private String tel;

    private static final long serialVersionUID = 1L;
}