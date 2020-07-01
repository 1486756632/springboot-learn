package com.yk.service.impl;

import com.yk.dao.IAccountDao;
import com.yk.entity.Account;

import com.yk.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    IAccountDao accountDAO;

    public int add() {
        return add();
    }

    public int add(Account account) {
        return accountDAO.add(account);
    }

    public int update(Account account) {
        return accountDAO.update(account);
    }

    public int delete(int id) {
        return accountDAO.delete(id);
    }

    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }

    public List<Account> findAccountList() {
        return accountDAO.findAccountList();
    }
}
