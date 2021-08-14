package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ManSettleT0;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ManSettleT0DAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ManSettleT0 record);

    int insertSelective(ManSettleT0 record);

    ManSettleT0 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ManSettleT0 record);

    int updateByPrimaryKey(ManSettleT0 record);
}