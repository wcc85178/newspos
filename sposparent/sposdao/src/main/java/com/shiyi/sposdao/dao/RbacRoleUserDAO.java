package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.RbacRoleUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RbacRoleUserDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(RbacRoleUser record);

    int insertSelective(RbacRoleUser record);

    RbacRoleUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RbacRoleUser record);

    int updateByPrimaryKey(RbacRoleUser record);
}