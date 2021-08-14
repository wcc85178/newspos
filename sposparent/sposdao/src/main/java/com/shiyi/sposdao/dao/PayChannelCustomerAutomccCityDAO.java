package com.shiyi.sposdao.dao;

import com.shiyi.sposdao.entity.PayChannelCustomerAutomccCity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PayChannelCustomerAutomccCityDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannelCustomerAutomccCity record);

    int insertSelective(PayChannelCustomerAutomccCity record);

    PayChannelCustomerAutomccCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannelCustomerAutomccCity record);

    int updateByPrimaryKey(PayChannelCustomerAutomccCity record);
}