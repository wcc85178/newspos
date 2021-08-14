package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 商户mcc信息表
 */
@Data
public class MccInfo implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 大类code
     */
    private String mccMold;

    /**
     * 大类描述
     */
    private String mccMoldDesc;

    /**
     * MCC编码
     */
    private String mccCode;

    /**
     * 子类描述
     */
    private String mccDesc;

    private static final long serialVersionUID = 1L;
}