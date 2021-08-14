package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Errfenrun implements Serializable {
    private String transId;

    private String amount;

    private static final long serialVersionUID = 1L;
}