package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.GenTableColumn;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GenTableColumnDAO {
    int deleteByPrimaryKey(Long columnId);

    int insert(GenTableColumn record);

    int insertSelective(GenTableColumn record);

    GenTableColumn selectByPrimaryKey(Long columnId);

    int updateByPrimaryKeySelective(GenTableColumn record);

    int updateByPrimaryKey(GenTableColumn record);
}