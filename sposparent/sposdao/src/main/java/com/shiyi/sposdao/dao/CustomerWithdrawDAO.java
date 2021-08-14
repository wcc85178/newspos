package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.CustomerWithdraw;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerWithdrawDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerWithdraw record);

    int insertSelective(CustomerWithdraw record);

    CustomerWithdraw selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerWithdraw record);

    int updateByPrimaryKey(CustomerWithdraw record);
}