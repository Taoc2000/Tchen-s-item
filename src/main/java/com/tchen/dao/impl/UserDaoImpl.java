package com.tchen.dao.impl;

import com.tchen.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user dao save..");
    }
}
