package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.RbacRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RbacRoleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(RbacRole record);

    int insertSelective(RbacRole record);

    RbacRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RbacRole record);

    int updateByPrimaryKey(RbacRole record);
}