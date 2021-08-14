package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Checkpos implements Serializable {
    private Integer id;

    private String sn;

    private Integer agent;

    private static final long serialVersionUID = 1L;
}