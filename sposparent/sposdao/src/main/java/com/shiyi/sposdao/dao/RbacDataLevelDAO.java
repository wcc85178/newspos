package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.RbacDataLevel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RbacDataLevelDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(RbacDataLevel record);

    int insertSelective(RbacDataLevel record);

    RbacDataLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RbacDataLevel record);

    int updateByPrimaryKey(RbacDataLevel record);
}