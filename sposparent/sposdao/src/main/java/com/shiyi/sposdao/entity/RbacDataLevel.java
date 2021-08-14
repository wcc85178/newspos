package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class RbacDataLevel implements Serializable {
    private Integer id;

    private Integer currentLevelData;

    private Integer lowLevelData;

    private Integer uid;

    private static final long serialVersionUID = 1L;
}