package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.RbacRoleEnableMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RbacRoleEnableMenuDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(RbacRoleEnableMenu record);

    int insertSelective(RbacRoleEnableMenu record);

    RbacRoleEnableMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RbacRoleEnableMenu record);

    int updateByPrimaryKey(RbacRoleEnableMenu record);
}