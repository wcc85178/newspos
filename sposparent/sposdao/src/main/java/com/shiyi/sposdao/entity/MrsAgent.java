package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 下游代理或机构记录表
 */
@Data
public class MrsAgent implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 下游名称
     */
    private String agentName;

    /**
     * 报文key
     */
    private String agentKey;

    /**
     * 下游交互编号
     */
    private String agentDeviceNo;

    /**
     * 下游来源编号
     */
    private String agentOrgNo;

    /**
     * 下游默认回调地址
     */
    private String backUrl;

    /**
     * 备注
     */
    private String remark;

    /**
     * 参数
     */
    private String params;

    /**
     * 记录状态 0-无效 1-正常
     */
    private String status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 绑定机构记录id（可为空)
     */
    private Integer organizId;

    private static final long serialVersionUID = 1L;
}