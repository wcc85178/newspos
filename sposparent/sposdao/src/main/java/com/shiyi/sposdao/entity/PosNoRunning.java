package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PosNoRunning implements Serializable {
    private Integer id;

    private String security;

    private Integer value;

    private Integer version;

    private static final long serialVersionUID = 1L;
}