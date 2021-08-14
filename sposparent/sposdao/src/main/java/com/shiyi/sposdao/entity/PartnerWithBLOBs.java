package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class PartnerWithBLOBs extends Partner implements Serializable {
    /**
     * 身份证正面照片地址
     */
    private String idcardfront;

    /**
     * 身份证反面照片地址
     */
    private String idcardback;

    /**
     * 支付密码
     */
    private byte[] paypassword;

    /**
     * 头像地址
     */
    private String icon;

    private static final long serialVersionUID = 1L;
}