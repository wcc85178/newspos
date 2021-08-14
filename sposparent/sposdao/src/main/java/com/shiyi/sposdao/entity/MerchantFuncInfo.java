package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 商户入网记录表
 */
@Data
public class MerchantFuncInfo implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 商户编号
     */
    private String mer;

    /**
     * 交易功能类型 2-支付宝 3-微信 23-银行卡收单
     */
    private String funcId;

    /**
     * 交易功能费率参数
     */
    private String funcRate;

    /**
     * 功能开通状态 0-未开通；1-已开通；2-失败；3-开通中
     */
    private String openStatus;

    /**
     * 功能拆分状态（微信支付宝专用）0-未拆分 1-拆分成功 2-拆分失败 3-拆分中
     */
    private String splitStatus;

    /**
     * 开通/拆分失败描述
     */
    private String failMsg;

    /**
     * 子商户号
     */
    private String channelId;

    /**
     * 渠道认证链接
     */
    private String channelAuthUrl;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}