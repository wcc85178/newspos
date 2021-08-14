package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 冻结机具调整记录表
 */
@Data
public class PosFreezeUploadRecord implements Serializable {
    private Integer id;

    /**
     * 上传文件名称
     */
    private String uploadFilename;

    /**
     * 上传成功总数
     */
    private Integer uploadSuccessCount;

    /**
     * 上传失败总数
     */
    private Integer uploadFailCount;

    /**
     * 执行成功总数
     */
    private Integer execSuccessCount;

    /**
     * 执行失败总数
     */
    private Integer execFailCount;

    /**
     * 执行类型 0：待操作 1：下发 2：回拨
     */
    private Integer execType;

    /**
     * 执行时间
     */
    private Date execTime;

    /**
     * 执行状态 0:未执行,1:已执行,2:已撤回
     */
    private Integer status;

    /**
     * 上传用户
     */
    private String uploadUsername;

    /**
     * 上传时间
     */
    private Date uploadTime;

    /**
     * 首笔扣费机构
     */
    private String insMark;

    /**
     * 首笔扣费金额
     */
    private String moneyMark;

    private static final long serialVersionUID = 1L;
}