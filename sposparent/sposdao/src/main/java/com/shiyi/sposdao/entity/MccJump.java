package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class MccJump implements Serializable {
    private Integer id;

    private String security;

    private Long createTime;

    private Integer enableFlag;

    private Integer fromMccFlag;

    private Integer toMccFlag;

    private static final long serialVersionUID = 1L;
}