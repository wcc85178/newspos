package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 机具表
 */
@Data
public class Pos implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 机具号
     */
    private String snCode;

    /**
     * 激活码,每次绑定成功后产生新的
     */
    private String code;

    /**
     * 厂商主键
     */
    private Integer posFactoryId;

    /**
     * 代理关系
     */
    private String security;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 出库时间
     */
    private Date outTime;

    /**
     * 机具绑定时间
     */
    private Date bindTime;

    /**
     * 激活时间，首次激活时间(主密钥下载)
     */
    private Date activeTime;

    /**
     * 终端主密钥1
     */
    private String mainKey1;

    /**
     * 终端主密钥2
     */
    private String mainKey2;

    /**
     * 校验值
     */
    private String mainKeyCheckvalue;

    /**
     * 工作密钥pik1
     */
    private String pik1;

    /**
     * 工作密钥pik2
     */
    private String pik2;

    /**
     * 校验值
     */
    private String pikCheckvalue;

    /**
     * 工作密钥mak1
     */
    private String mak1;

    /**
     * 工作密钥mak2
     */
    private String mak2;

    /**
     * 校验值
     */
    private String makCheckvalue;

    /**
     * 备注
     */
    private String mark;

    /**
     * 操作员
     */
    private String operatorName;

    /**
     * 激活标识 0 未激活 1 已激活
     */
    private Short usedFlag;

    /**
     * 商户主键
     */
    private Integer refCustomerId;

    /**
     * 最后一次签到时间
     */
    private Date lastSignTime;

    /**
     * 0不需要 1需要 
     */
    private String needchargeback;

    /**
     * 0 未扣费 1 已扣费 
     */
    private String chargebackdone;

    /**
     * 扣费金额
     */
    private String chargebackamount;

    /**
     * sim卡号，通信卡号 或是wifi模块号  POS 上送 每次主密钥下载更新
     */
    private String simno;

    /**
     * 通信模块硬件编号 POS 上送 每次主密钥下载更新
     */
    private String imei;

    /**
     * 主密钥下载时间
     */
    private Date mainkeyDownloadTime;

    /**
     * 是否需要升级程序, 0 不需要  1 需要
     */
    private Integer isUpdate;

    /**
     * 应用版本号
     */
    private String version;

    /**
     * 一级机构号,33聚成
     */
    private Integer firstInsId;

    /**
     * 政策编号
     */
    private String policyId;

    private static final long serialVersionUID = 1L;
}