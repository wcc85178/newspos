package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpFunctionMetaBill implements Serializable {
    private Integer metaBillId;

    private Integer cpFunctionId;

    private static final long serialVersionUID = 1L;
}