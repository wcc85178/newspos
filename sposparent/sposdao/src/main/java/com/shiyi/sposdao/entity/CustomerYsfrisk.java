package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 商户云闪付银行卡验证记录
 */
@Data
public class CustomerYsfrisk implements Serializable {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 商户主键
     */
    private Integer customerId;

    /**
     * 银行卡密文
     */
    private String cardNo;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}