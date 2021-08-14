package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 卡验证记录
 */
@Data
public class CardAuth implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 请求来源
     */
    private String reqFrom;

    /**
     * 结果描述
     */
    private String rspDesc;

    /**
     * 返回类型
     */
    private String rspType;

    /**
     * 返回码
     */
    private String despCode;

    /**
     * 流水id
     */
    private String transId;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private String creatTime;

    /**
     * 响应时间
     */
    private String respTime;

    /**
     * 银行卡号
     */
    private String bankCardNo;

    /**
     * 姓名
     */
    private String userCradName;

    /**
     * 身份证号
     */
    private String idCardNo;

    /**
     * 操作人
     */
    private String editor;

    /**
     * 持卡人预留手机号
     */
    private String holderTel;

    private static final long serialVersionUID = 1L;
}