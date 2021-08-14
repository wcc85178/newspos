package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.GenTable;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GenTableDAO {
    int deleteByPrimaryKey(Long tableId);

    int insert(GenTable record);

    int insertSelective(GenTable record);

    GenTable selectByPrimaryKey(Long tableId);

    int updateByPrimaryKeySelective(GenTable record);

    int updateByPrimaryKey(GenTable record);
}