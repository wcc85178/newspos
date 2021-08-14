package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 商户入网记录表
 */
@Data
public class MerchantReqRecord implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 商户编号
     */
    private String mer;

    /**
     * 请求操作类型
     */
    private String reqType;

    /**
     * 请求流水
     */
    private String reqTrace;

    /**
     * 记录处理状态 0-数据提交成功 1-查询已完成 2-数据提交失败

     */
    private String status;

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