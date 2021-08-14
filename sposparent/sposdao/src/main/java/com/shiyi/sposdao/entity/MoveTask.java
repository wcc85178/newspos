package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class MoveTask implements Serializable {
    private Integer id;

    private String security;

    private String moveDate;

    private Integer moveFlag;

    private static final long serialVersionUID = 1L;
}