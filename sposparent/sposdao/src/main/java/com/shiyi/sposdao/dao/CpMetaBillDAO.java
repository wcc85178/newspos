package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpMetaBill;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpMetaBillDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpMetaBill record);

    int insertSelective(CpMetaBill record);

    CpMetaBill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpMetaBill record);

    int updateByPrimaryKey(CpMetaBill record);
}