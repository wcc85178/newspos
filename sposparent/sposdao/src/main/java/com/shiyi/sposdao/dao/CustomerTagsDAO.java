package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerTags;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerTagsDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerTags record);

    int insertSelective(CustomerTags record);

    CustomerTags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerTags record);

    int updateByPrimaryKey(CustomerTags record);
}