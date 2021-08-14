package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class HibernateSequence implements Serializable {
    private Long nextVal;

    private static final long serialVersionUID = 1L;
}