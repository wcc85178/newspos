package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 小商户补充资料表
 */
@Data
public class CustomerAdditionalMaterials implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer customerId;

    /**
     * 营业执照
     */
    private String businessPhoto;

    /**
     * 营业执照名称
     */
    private String businessLicenseName;

    /**
     * 营业执照号
     */
    private String businessLicenseNo;

    /**
     * 营业执照有效期
     */
    private String businessLicenseExpire;

    /**
     * 门头照
     */
    private String doorPhoto;

    /**
     * 收银照片
     */
    private String cashierPhoto;

    /**
     * 店内照
     */
    private String inStorePhoto;

    /**
     * 审核状态 0 审核中 1 审核成功  2 审核失败
     */
    private Integer auditState;

    /**
     * 审核描述，失败原因
     */
    private String auditDesc;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}