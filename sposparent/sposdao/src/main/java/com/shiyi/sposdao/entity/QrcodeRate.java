package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 商户银联二维码支付费率表
 */
@Data
public class QrcodeRate implements Serializable {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 0:T0、1:T1
     */
    private Integer tnFlag;

    /**
     * 交易手续费公式
     */
    private String tradeFee;

    /**
     * 提现手续费
     */
    private String withdrawalFee;

    /**
     * 描述
     */
    private String descr;

    private static final long serialVersionUID = 1L;
}