package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Partner implements Serializable {
    private Integer id;

    private Date createtime;

    private Date updatetime;

    /**
     * 手机号（登录帐号）
     */
    private String mobile;

    /**
     * 合伙人状态（0：未实名，1：已实名）
     */
    private Integer status;

    /**
     * 个人等级
     */
    private Integer grade;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 个人推荐码
     */
    private String referkey;

    /**
     * 推荐合伙人Id
     */
    private Integer referid;

    /**
     * 推荐合伙人姓名
     */
    private String refername;

    /**
     * 身份证姓名
     */
    private String realname;

    /**
     * 上级编号
     */
    private String upReferkey;

    /**
     * app显示名字
     */
    private String showname;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 对应机构Id（如果自身是机构，则单独记录对应的机构Id）
     */
    private Integer institutionid;

    /**
     * 所属一级机构Id（如果自身是一级机构，则该字段为自己对应的一级机构Id）
     */
    private Integer firstinstitutionid;

    /**
     * 所属二级机构Id（如果自身是二级机构，则该字段为自己对应的二级机构Id）
     */
    private Integer secondinstitutionid;

    private Integer thirdinstitutionid;

    /**
     * 审核通过实践
     */
    private Date checktime;

    /**
     * 审核不通过原因
     */
    private String reason;

    /**
     * 我的金币
     */
    private Integer mygold;

    /**
     * 冻结的金币
     */
    private Integer frozengold;

    /**
     * 喔币使用的标识: 0 关闭 1 启用
     */
    private Integer usergoldconf;

    /**
     * 易生系统里面的代理商主键
     */
    private String agent;

    /**
     * 激活机具的数量
     */
    private Integer activatecount;

    /**
     * 合伙人自己以及自己下级所有激活的机具数量
     */
    private Integer allactivatecount;

    /**
     * 自身商户的t0交易总额
     */
    private Double t0moneycount;

    /**
     * 自身商户的t1交易总额
     */
    private Double t1moneycount;

    /**
     * 自身商户的快捷交易总额
     */
    private Double qpmoneycount;

    /**
     * 自身商户的其他方式交易总额
     */
    private Double othermoneycount;

    /**
     * 自身总共交易额
     */
    private Double moneycount;

    /**
     * 自身产生的交易笔数
     */
    private Integer paycount;

    /**
     * 所有的交易额(包括自身以及下属的交易额)
     */
    private Double allmoneycount;

    /**
     * 易生系统代理商分润结算账号
     */
    private String agentaccount;

    /**
     * 易生系统代理商自由资金账号
     */
    private String ownaccount;

    /**
     * 易生系统代理商活动账号
     */
    private String flexibleaccount;

    /**
     * 代理商关系
     */
    private String agents;

    /**
     * 0 不是有效合伙人 1 有效合伙人
     */
    private Short standpartner;

    /**
     * 有效合伙人判定时间
     */
    private Date standtime;

    /**
     * 达标时的机具数量
     */
    private Integer standposnum;

    /**
     * 激活达标 0 未达标 1 已达标
     */
    private Short jihuostand;

    /**
     * 激活达标时间
     */
    private Date jihuostandtime;

    /**
     * 激活达标人数
     */
    private Integer jihuonum;

    /**
     * 可使用的标识 1:可使用 0: 不可使用
     */
    private Short enable;

    /**
     * Wpos交易笔数
     */
    private Double wposmoneycount;

    /**
     * Wpos交易金额
     */
    private Double wposmoney;

    /**
     * 参加活动的等级：0 未参加; 1 参加并且是1级 类推
     */
    private Byte activeflag;

    private static final long serialVersionUID = 1L;
}