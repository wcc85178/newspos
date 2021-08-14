package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.RbacRoleEnableButton;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RbacRoleEnableButtonDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(RbacRoleEnableButton record);

    int insertSelective(RbacRoleEnableButton record);

    RbacRoleEnableButton selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RbacRoleEnableButton record);

    int updateByPrimaryKey(RbacRoleEnableButton record);
}