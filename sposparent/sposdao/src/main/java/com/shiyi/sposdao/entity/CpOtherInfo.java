package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpOtherInfo implements Serializable {
    private Integer id;

    private String security;

    private String bottomBanner;

    private String headBanner;

    private static final long serialVersionUID = 1L;
}