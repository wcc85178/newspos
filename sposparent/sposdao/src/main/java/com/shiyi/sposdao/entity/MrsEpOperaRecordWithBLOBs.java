package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 请求易生操作记录表
 */
@Data
public class MrsEpOperaRecordWithBLOBs extends MrsEpOperaRecord implements Serializable {
    /**
     * 请求数据
     */
    private String reqData;

    /**
     * 扩展数据
     */
    private String extData;

    /**
     * 响应数据
     */
    private String respData;

    /**
     * 审核查询请求数据
     */
    private String auditReqData;

    /**
     * 审核查询响应数据
     */
    private String auditRespData;

    private static final long serialVersionUID = 1L;
}