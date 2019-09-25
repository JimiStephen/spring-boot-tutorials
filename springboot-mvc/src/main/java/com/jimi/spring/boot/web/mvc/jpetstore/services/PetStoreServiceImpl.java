package com.jimi.spring.boot.web.mvc.jpetstore.services;

import com.jimi.spring.boot.web.mvc.dao.jpa.JpaAccountDao;
import com.jimi.spring.boot.web.mvc.dao.jpa.JpaItemDao;
import com.jimi.spring.boot.web.mvc.jpetstore.services.inter.PetStoreService;

import java.util.List;

public class PetStoreServiceImpl implements PetStoreService {

    private JpaAccountDao accountDao;

    public JpaAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public JpaItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }

    private JpaItemDao itemDao;

    @Override
    public List<String> getUsernameList() {
        return null;
    }
}
