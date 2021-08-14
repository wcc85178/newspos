package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.MessageAccount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MessageAccountDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageAccount record);

    int insertSelective(MessageAccount record);

    MessageAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageAccount record);

    int updateByPrimaryKeyWithBLOBs(MessageAccount record);

    int updateByPrimaryKey(MessageAccount record);
}