package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 下游请求操作记录表
 */
@Data
public class MrsAgentOperaRecordWithBLOBs extends MrsAgentOperaRecord implements Serializable {
    /**
     * 请求数据
     */
    private String reqData;

    /**
     * 响应数据
     */
    private String respData;

    private static final long serialVersionUID = 1L;
}