package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Agenttwoconfig implements Serializable {
    private Integer id;

    private Integer type;

    private String roleId;

    private String mark;

    /**
     * T0成本比例
     */
    private String fengdingFenrun;

    /**
     * T1成本比例
     */
    private String t1fenrun1;

    /**
     * 代理商T0单笔成本
     */
    private String agentDrawFee;

    /**
     * 代理商名下商户T0首次交易默认提现费
     */
    private String counterFee;

    /**
     * 说明用户资金的处理方式 0正常 1 提现费不分润
     */
    private String t1fenrunMark;

    /**
     * 银联T0单笔成本
     */
    private String t0fenrunMark;

    /**
     * 银联T0单笔成本费率
     */
    private String t0fenrun2;

    /**
     * 银联T1单笔成本费率
     */
    private String t1fenrun2;

    /**
     * 0表示不可编辑
     */
    private String readonly;

    private String initCustomerMccRate;

    /**
     * 0 不允许修改 邮箱 1：允许
     */
    private String changeMail;

    private static final long serialVersionUID = 1L;
}