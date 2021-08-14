package com.shiyi.sapp.service;

import com.shiyi.sposdao.entity.AccountWithdrawalRecord;


public interface TestService {
    AccountWithdrawalRecord selectByPrimaryKey(Integer id);
}
