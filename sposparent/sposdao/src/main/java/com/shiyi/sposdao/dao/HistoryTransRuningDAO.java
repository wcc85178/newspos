package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.HistoryTransRuning;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HistoryTransRuningDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(HistoryTransRuning record);

    int insertSelective(HistoryTransRuning record);

    HistoryTransRuning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HistoryTransRuning record);

    int updateByPrimaryKey(HistoryTransRuning record);
}