package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 机构菜单交易配置表
 */
@Data
public class AgentMenuConfig implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 交易控制
第一位 0 关闭消费菜单 1 开启T0  2 开启T0,T1
第二位 0 不支持扣费 1 支持扣费
第三位 0 交易活动不累计 1交易活动累计T0 2 交易活动累计T1 3 交易都累计 C信用卡 D借记卡 A全部 
第四位 0 不支持扣流量费 1 支持扣流量费
第五位 0 交易费率不累计 1交易费率累计T0 2 交易费率累计T1 3 交易费率都累计 C信用卡 D借记卡 A全部 
     */
    private String tradeSwitch;

    /**
     * 闪付控制
第一位 0 关闭闪付菜单 1 开启
第二位 0 不支持扣费 1 支持扣费
第三位 0 交易活动不累计 1交易活动 C信用卡 D借记卡 A全部 
第四位 0 不支持扣流量费 1 支持扣流量费
第五位 0 交易费率不累计 1交易费率累计 C信用卡 D借记卡 A全部 
     */
    private String sfSwitch;

    /**
     * 扫码控制
第一位 0 关闭菜单 1 开启T0  2 开启T0,T1
第二位 0 不支持扣费 1 支持扣费
第三位 0 交易活动不累计 1交易活动累计T0 2 交易活动累计T1 3 交易都累计 C信用卡 D借记卡 A全部 
第四位 0 不支持扣流量费 1 支持扣流量费
第五位 0 交易费率不累计 1交易费率累计T0 2 交易费率累计T1 3 交易费率都累计 C信用卡 D借记卡 A全部 
     */
    private String qrSwitch;

    /**
     * 二维码控制
第一位 0 关闭菜单 1 开启T0  2 开启T0,T1
第二位 0 不支持扣费 1 支持扣费
第三位 0 交易活动不累计 1交易活动累计T0 2 交易活动累计T1 3 交易都累计 C信用卡 D借记卡 A全部 
第四位 0 不支持扣流量费 1 支持扣流量费
第五位 0 交易费率不累计 1交易费率累计T0 2 交易费率累计T1 3 交易费率都累计 C信用卡 D借记卡 A全部 
     */
    private String scanSwitch;

    /**
     * 一级机构
     */
    private Integer firstInsId;

    /**
     * 政策编号
     */
    private String policyId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}