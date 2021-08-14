package com.shiyi.sposdao.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 图片上传易生记录
 */
@Data
public class MrsPicUploadRecordWithBLOBs extends MrsPicUploadRecord implements Serializable {
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