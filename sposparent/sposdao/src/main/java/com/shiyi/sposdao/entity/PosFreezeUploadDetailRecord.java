package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 冻结机具调整记录表
 */
@Data
public class PosFreezeUploadDetailRecord implements Serializable {
    private Integer id;

    /**
     * 机器设备号
     */
    private String snCode;

    /**
     * 冻结机具调整记录表-主键ID
     */
    private Integer uploadRecordId;

    /**
     * 导入状态 1:导入失败,2:导入成功
     */
    private Integer uploadStatus;

    /**
     * 执行状态 0:未执行,1:下发成功, 2:下发失败 3 回拨成功 4 回拨失败
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}