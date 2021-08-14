package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 商户入网图片文件信息表
 */
@Data
public class MerchantFileInfo implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 商户编号
     */
    private String mer;

    /**
     * 图片文件名
     */
    private String picName;

    /**
     * 图片文件路径
     */
    private String picUrl;

    /**
     * 图片类型 01 - 法人身份证正面 ；02-法人身份证反面；03-商户联系人身份证正面；04-商户联系人身份证反面；05-营业执照；06-收银台；07-内部环境照；08-营业场所门头照；09-门牌号；10-协议；11-商户登记表正面；12-商户登记表反面；13-开户许可证；14-银行卡；15-清算授权书；16-定位照（选填）；17-手持身份证照片（选填）18-法人手持营业执照与门头合影(选填)
19-特约协议照片(选填)
20-法人头像照(小微必传做人像比对)
     */
    private String picMode;

    /**
     * 图片唯一id
     */
    private String fileId;

    /**
     * 图片上传返回码
     */
    private String retCode;

    /**
     * 图片上传返回信息
     */
    private String retMsg;

    /**
     * 创建时间 
     */
    private Date createTime;

    /**
     * 修改时间 
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}