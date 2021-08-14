package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerClientkey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerClientkeyDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerClientkey record);

    int insertSelective(CustomerClientkey record);

    CustomerClientkey selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerClientkey record);

    int updateByPrimaryKeyWithBLOBs(CustomerClientkey record);

    int updateByPrimaryKey(CustomerClientkey record);
}