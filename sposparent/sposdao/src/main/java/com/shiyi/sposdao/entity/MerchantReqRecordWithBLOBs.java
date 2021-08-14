package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 商户入网记录表
 */
@Data
public class MerchantReqRecordWithBLOBs extends MerchantReqRecord implements Serializable {
    /**
     * 请求数据
     */
    private String reqData;

    /**
     * 响应数据
     */
    private String respData;

    /**
     * 查询请求数据
     */
    private String queryReqData;

    /**
     * 查询响应数据
     */
    private String queryRespData;

    private static final long serialVersionUID = 1L;
}