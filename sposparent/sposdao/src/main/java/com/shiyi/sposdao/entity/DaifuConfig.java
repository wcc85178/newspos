package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class DaifuConfig implements Serializable {
    private Integer id;

    private String payRspCode;

    private static final long serialVersionUID = 1L;
}