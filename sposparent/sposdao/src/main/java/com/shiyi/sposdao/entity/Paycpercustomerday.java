package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Paycpercustomerday implements Serializable {
    private Integer id;

    private String day;

    private Integer num;

    private static final long serialVersionUID = 1L;
}