package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosBatchNo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosBatchNoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosBatchNo record);

    int insertSelective(PosBatchNo record);

    PosBatchNo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosBatchNo record);

    int updateByPrimaryKey(PosBatchNo record);
}