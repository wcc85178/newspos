package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MessageActivity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MessageActivityDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageActivity record);

    int insertSelective(MessageActivity record);

    MessageActivity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageActivity record);

    int updateByPrimaryKeyWithBLOBs(MessageActivity record);

    int updateByPrimaryKey(MessageActivity record);
}