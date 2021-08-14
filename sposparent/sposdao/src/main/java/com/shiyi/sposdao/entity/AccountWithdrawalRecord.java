package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class AccountWithdrawalRecord implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 账户编号
     */
    private Integer accountId;

    /**
     * 交易码
     */
    private String trancde;

    /**
     * 卡号
     */
    private String card;

    /**
     * 姓名
     */
    private String name;

    /**
     * 提现订单号
     */
    private String billId;

    /**
     * 原提现订单号
     */
    private String orgBillId;

    /**
     * 提现金额
     */
    private Long billAmt;

    /**
     * 提现手续费
     */
    private Long billFee;

    /**
     * 范围0-5，0表示T+0，1表示T+1，依此类推
     */
    private Integer amtDate;

    /**
     * 账户提现请求结果
     */
    private String field39;

    /**
     * 账户提现请求错误描述
     */
    private String message;

    /**
     * 异步通知,代付结果(00成功，其它失败)
     */
    private String result;

    /**
     * 账户余额
     */
    private BigDecimal accountAmt;

    /**
     * 账户冻结金额
     */
    private BigDecimal accountFrozenAmt;

    /**
     * 账户可用余额
     */
    private BigDecimal accountFreeAmt;

    /**
     * 处理时间
     */
    private Date handlingTime;

    /**
     * 0:未知、1:扣费机器提现、2:代理商分润提现(日结)、3:代理商分润提现(2.0补贴)、4:金融超市分润补贴、5:喔刷代理分润提现(1.1)、6:渠道商日结分润、7:代理商分润提现、8:商户分润提现
     */
    private Integer billType;

    /**
     * 000:不区分大小蓝牙,001:小蓝牙、002:大蓝牙、003:csp平台、004:csp平台(金融超市\\喔刷代理分润提现)、005:swp平台、006:swp-app平台
     */
    private String fromType;

    /**
     * 入账账户编号,快捷专门使用
     */
    private Integer inAccountId;

    /**
     * 入账账户手机号,快捷专门使用
     */
    private String inMobile;

    /**
     * 异步通知地址
     */
    private String notifyUrl;

    private static final long serialVersionUID = 1L;
}