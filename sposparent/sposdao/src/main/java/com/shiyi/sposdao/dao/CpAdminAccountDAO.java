package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CpAdminAccount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CpAdminAccountDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CpAdminAccount record);

    int insertSelective(CpAdminAccount record);

    CpAdminAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CpAdminAccount record);

    int updateByPrimaryKey(CpAdminAccount record);
}