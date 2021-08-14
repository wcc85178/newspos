package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CpModuleCpFunction implements Serializable {
    private Integer cpFunctionId;

    private Integer cpModuleId;

    private static final long serialVersionUID = 1L;
}