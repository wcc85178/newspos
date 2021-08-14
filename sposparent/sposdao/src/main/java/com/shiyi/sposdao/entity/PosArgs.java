package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PosArgs implements Serializable {
    private Integer id;

    private String security;

    private Integer groupCode;

    private Integer paramArgsType;

    private String paramCode;

    private String paramName;

    private Integer paramType;

    private String paramValue;

    private static final long serialVersionUID = 1L;
}