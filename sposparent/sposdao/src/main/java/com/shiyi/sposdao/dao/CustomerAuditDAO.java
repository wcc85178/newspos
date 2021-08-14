package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerAudit;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerAuditDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAudit record);

    int insertSelective(CustomerAudit record);

    CustomerAudit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAudit record);

    int updateByPrimaryKey(CustomerAudit record);
}