package com.tchen.dao.impl;

import com.tchen.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;

    //构造器注入
    public BookDaoImpl(int connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    //setter注入
    //public void setConnectionNum(int connectionNum) {
    //    this.connectionNum = connectionNum;
    //}
    //
    //public void setDatabaseName(String databaseName) {
    //    this.databaseName = databaseName;
    //}

    public void save(){
        System.out.println("book dao save ..."+databaseName+","+connectionNum);
        //System.out.println("book dao save.");
    }

    public void init(){
        System.out.println("init..");
    }

    public void destroy() {
        System.out.println("destory...");
    }




}
