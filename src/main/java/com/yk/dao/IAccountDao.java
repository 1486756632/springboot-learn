package com.yk.dao;

import com.yk.entity.Account;

import java.util.List;

public interface IAccountDao {
    int add(Account account);

    int update(Account account);

    int delete(int id);


    List<Account> findAccountList();

    Account findAccountById(int id);
}
