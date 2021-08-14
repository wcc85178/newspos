package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 图片上传易生记录
 */
@Data
public class MrsPicUploadRecord implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 请求流水
     */
    private String reqTrace;

    /**
     * 易生图片唯一id
     */
    private String picFileId;

    /**
     * 图片类型
     */
    private String picType;

    /**
     * 图片链接
     */
    private String picPath;

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