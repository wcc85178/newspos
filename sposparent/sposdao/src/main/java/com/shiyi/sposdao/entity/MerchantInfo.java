package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 商户入网基本信息表
 */
@Data
public class MerchantInfo implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 商户编号，用户信息表的商户编号
     */
    private String mer;

    /**
     * 商户入网成功后返回的内部商户号
     */
    private String merCode;

    /**
     * 商户入网后返回的唯一标识
     */
    private String merTrace;

    /**
     * 操作流水号
     */
    private String operaTrace;

    /**
     * 商户名
     */
    private String merName;

    /**
     * 商户简称 (经营名称，店名)
     */
    private String businName;

    /**
     * 商户英文名，暂无用
     */
    private String merEngName;

    /**
     * 行业大类 0-标准、1-优惠、2-减免，目前默认0
     */
    private String standardFlag;

    /**
     * 商户地址，暂无值
     */
    private String merAddr;

    /**
     * 营业时间：开始时间，格式：HHMM
     */
    private String businBegtime;

    /**
     * 营业时间：结束时间，格式：HHMM
     */
    private String businEndtime;

    /**
     * 公司规模:1：0-50人；2：50-100人；3:100以上
     */
    private String employeeNum;

    /**
     * 经营形态：02-普通店、01-连锁店
     */
    private String businForm;

    /**
     * 商户入网状态：0-未入网  1-入网中  2-入网成功 3-入网失败
     */
    private String status;

    /**
     * 商户审核状态：0-待入网  1-待审  2-待处理  3-审核成功
     */
    private String auditStatus;

    /**
     * 商户联接方式 1-直联(直联银联的商户)、0-间联（非直联银联的，默认为0）
     */
    private String conMode;

    /**
     * 是否虚拟账户（0 — 银行账户（默认）， 1 — 虚拟账户）
     */
    private String payAccMode;

    /**
     * 是否易生清算：0 — 挂账， 1 — 正常清算商户，X—不清算，F—不结算
     */
    private String stlmType;

    /**
     * 备注
     */
    private String merMark;

    /**
     * 联系人姓名
     */
    private String linkMan;

    /**
     * 联系人证件类型：0-居民身份证或临时身份证;1-外国公民护照;2-港澳居民来往大陆通行证或其他有效旅游证件；3-其他类个人身份有效证件；4-单位证件；5-军人或武警身份证件
     */
    private String linkManType;

    /**
     * 联系人证件号码
     */
    private String linkManCode;

    /**
     * 联系人证件有效期起始日期 yyyyMMdd
     */
    private String linkManValidStart;

    /**
     * 联系人证件有效期截止日期 yyyyMMdd
     */
    private String linkManValidEnd;

    /**
     * 联系人手机号
     */
    private String linkManPhone;

    /**
     * 联系人固定电话
     */
    private String linkManMobile;

    /**
     * 商户创建时间 
     */
    private Date createTime;

    /**
     * 商户修改时间  
     */
    private Date updateTime;

    /**
     * 终端sn号
     */
    private String snCode;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 审核说明
     */
    private String auditMsg;

    /**
     * 二维码结算状态 0-禁用 1-启用
     */
    private String qrStatus;

    /**
     * 易生内部商户号
     */
    private String epMerCode;

    /**
     * 入网时间
     */
    private Date regTime;

    /**
     * 拆分状态
0-未拆分 1-拆分成功 2-拆分失败 3-拆分中
     */
    private String splitStatus;

    /**
     * 拆分渠道
     */
    private String splitChannel;

    /**
     * 拆分结果说明
     */
    private String splitMsg;

    private static final long serialVersionUID = 1L;
}