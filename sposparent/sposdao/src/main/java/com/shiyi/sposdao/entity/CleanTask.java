package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CleanTask implements Serializable {
    private Integer id;

    private String security;

    private String cleanDate;

    private Integer cleanFlag;

    private static final long serialVersionUID = 1L;
}