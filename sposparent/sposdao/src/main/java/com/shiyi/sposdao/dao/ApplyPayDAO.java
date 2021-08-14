package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ApplyPay;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ApplyPayDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ApplyPay record);

    int insertSelective(ApplyPay record);

    ApplyPay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplyPay record);

    int updateByPrimaryKey(ApplyPay record);
}