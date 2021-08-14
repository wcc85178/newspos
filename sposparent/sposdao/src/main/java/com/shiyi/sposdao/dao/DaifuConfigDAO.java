package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.DaifuConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DaifuConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(DaifuConfig record);

    int insertSelective(DaifuConfig record);

    DaifuConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DaifuConfig record);

    int updateByPrimaryKey(DaifuConfig record);
}