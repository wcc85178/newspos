package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class CustomerAutoApply implements Serializable {
    private Integer id;

    private String code;

    private String name;

    private String addr;

    private String businessLicence1;

    private String businessLicence2;

    private String storeUp1;

    private String storeUp2;

    private String storeDown1;

    private String storeDown2;

    private String img4Up1r;

    private Date createTime;

    /**
     * 1 待审核 2 审核通过 3 驳回
     */
    private String auditFlag;

    private Date applyAuthTime;

    private String enableFlag;

    private String mark;

    private static final long serialVersionUID = 1L;
}