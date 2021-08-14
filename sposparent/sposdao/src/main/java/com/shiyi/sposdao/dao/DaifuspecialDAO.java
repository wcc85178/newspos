package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.Daifuspecial;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DaifuspecialDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Daifuspecial record);

    int insertSelective(Daifuspecial record);

    Daifuspecial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Daifuspecial record);

    int updateByPrimaryKey(Daifuspecial record);
}