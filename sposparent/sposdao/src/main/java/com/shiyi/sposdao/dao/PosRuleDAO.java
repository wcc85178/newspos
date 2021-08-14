package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PosRule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PosRuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PosRule record);

    int insertSelective(PosRule record);

    PosRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PosRule record);

    int updateByPrimaryKey(PosRule record);
}