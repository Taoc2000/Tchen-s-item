package com.tchen.service.impl;

import com.tchen.dao.BookDao;
import com.tchen.dao.UserDao;
import com.tchen.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    private BookDao bookDao;
    private UserDao userDao;

    //setter注入
    //public void setUserDao(UserDao userDao) {
    //    this.userDao = userDao;
    //}

    //public void setBookDao(BookDao bookDao) {
    //    System.out.println("set....");
    //    this.bookDao = bookDao;
    //}


    //构造器注入
    public BookServiceImpl(BookDao bookDao,UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void save(){
        System.out.println("book service save...");
        bookDao.save();
        userDao.save();
    }



    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("service init..");
    }


}
