package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosSettleBatch;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosSettleBatchDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosSettleBatch record);

    int insertSelective(PosSettleBatch record);

    PosSettleBatch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosSettleBatch record);

    int updateByPrimaryKey(PosSettleBatch record);
}