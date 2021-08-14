package com.shiyi.sposdao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author 
 * 用户标签类型表
 */
@Data
public class CustomerTagType implements Serializable {
    private Integer id;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 标签等级
     */
    private Integer grade;

    /**
     * 父级标签
     */
    private Integer parentId;

    /**
     * 是否禁用，0禁用 1启用
     */
    private Integer enableFlag;

    private static final long serialVersionUID = 1L;
}