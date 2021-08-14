package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CardBin implements Serializable {
    private Integer id;

    private String security;

    private String bankName;

    private String binCode;

    private String cardNickname;

    private Integer cardType;

    private String orgCode;

    private static final long serialVersionUID = 1L;
}