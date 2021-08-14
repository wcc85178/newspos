package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.ChangAgentRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ChangAgentRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ChangAgentRecord record);

    int insertSelective(ChangAgentRecord record);

    ChangAgentRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChangAgentRecord record);

    int updateByPrimaryKey(ChangAgentRecord record);
}