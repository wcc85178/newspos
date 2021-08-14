package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 用户表
 */
@Data
public class Customer extends CustomerKey implements Serializable {
    /**
     * 商户编号,唯一 不变
     */
    private String mer;

    /**
     * 代理商关系
     */
    private String security;

    /**
     * 100020000:未认证
* 100020001:认证通过
* 100020002:驳回,认证失败
     */
    private Integer auditFlag;

    /**
     * 驳回原因说明
     */
    private String bohuiMark;

    /**
     * 手机号
     */
    private String code;

    /**
     * 经营地址
     */
    private String consumerAddr;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 冻结状态 100030001 解冻 100030000 冻结
     */
    private Integer enableFlag;

    /**
     * 签名(未使用)
     */
    private String handSignImg;

    /**
     * 手持证件照
     */
    private String imgHandIdCard;

    /**
     * 身份证反面
     */
    private String imgIdCardDown;

    /**
     * 身份证正面
     */
    private String imgIdCardUp;

    /**
     * 邮箱
     */
    private String manEmail;

    /**
     * 身份证号
     */
    private String manIdCard;

    /**
     * 姓名
     */
    private String manName;

    /**
     * 手机号
     */
    private String manTel;

    /**
     * 备注
     */
    private String mark;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String photo;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 手机号
     */
    private String username;

    /**
     * 默认1 所属代理id
     */
    private Integer refAgentId;

    /**
     * 实名认证审核状态(弃用)
     */
    private Integer xykRzFlag;

    /**
     * 申请时间
     */
    private Long applyAuthTime;

    /**
     * 达标
     */
    private String standard;

    /**
     * 激活时间
     */
    private Long activetime;

    /**
     * 达标时间
     */
    private Long standardTime;

    /**
     * 费率
     */
    private String mccRate;

    /**
     * 平台 ios android
     */
    private String platform;

    /**
     * 未使用
     */
    private Long showTime;

    /**
     * 单笔手续费
     */
    private String counterFee;

    /**
     * 是否购买过VIP  0 未购买过 1 已购买 2 已达标 3 已过期
     */
    private String chargebackdone;

    /**
     * spp开户id
     */
    private Integer accountid;

    /**
     * 未使用
     */
    private String closed;

    /**
     * 1.1代理商名下用户扣费标识。-1 存量 0 增量未扣费 1 已扣费
     */
    private String agentkoufeidone;

    /**
     * 最近一次交易时间
     */
    private Date lasttranstime;

    /**
     *  0 沉默 1 活跃
     */
    private Short negativeflag;

    /**
     * 沉默月数
     */
    private Short negativemonth;

    /**
     * 信用卡达标标记；0 未达标 1 已达标
     */
    private Byte iscreditcstand;

    /**
     * 信用卡达标时间
     */
    private Date iscreditctime;

    /**
     * 注册地址
     */
    private String registAddr;

    /**
     * 版本号
     */
    private String version;

    /**
     * app平台：ios,android 
     */
    private String platformApp;

    /**
     * 下载来源
     */
    private String appDownPlatform;

    /**
     * 版本备用字段
     */
    private String avmark;

    /**
     * 最近登录时间
     */
    private Date lastlgintime;

    /**
     * 扣费授权标识
     */
    private Byte kfsignflag;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 身份证的有效期
     */
    private String cerValidity;

    /**
     * 1.tel 2.wechat_local_tel 3 wechat_other_tel 4.本机号码注册
     */
    private Integer registerWay;

    /**
     * 1.old 2.new 3 沉默用户认证
     */
    private Integer authWay;

    /**
     * vip开始日期
     */
    private String vipStartDate;

    /**
     * vip会员结束日期
     */
    private String vipEndDate;

    /**
     * 1.vip 2.过期 3.退款
     */
    private Integer vipState;

    /**
     * 是否是沉默用户 0:不是,1:喔刷沉默(实名),2:喔刷沉默(非实名),3:易多付沉默(实名),4:易多付沉默(非实名),5:壹生付沉默(实名),6:壹生付沉默(非实名),7:壹pos沉默(实名),8:壹pos沉默(非实名)
     */
    private Integer isSilentCustomer;

    /**
     * 经纬度
     */
    private String longitudeAndLatitude;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 是否首笔扣费过(道合机具首笔扣费120) 0 未扣费 1 已扣费 2. 扣费达标  3.扣费未达标
     */
    private String isbackdone;

    /**
     * 冻结原因
     */
    private String freezeMark;

    /**
     * 代理 1 JH
     */
    private String agentType;

    /**
     * 流量卡是否需要扣费 1需要扣费 0不需要扣费
     */
    private String posTrafficKfStatus;

    /**
     * 用户首次成功交易时间
     */
    private Date firstTransSucTime;

    /**
     * 下次设备流量卡扣费时间
     */
    private Date nextPosKfTime;

    /**
     * 流量卡扣费方式：1:31天 2：一年
     */
    private String renewalWay;

    private String policyId;

    private static final long serialVersionUID = 1L;
}