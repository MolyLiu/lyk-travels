package com.lyk.travels.model;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Slf4j
public class UserBaseInfo implements Serializable {

    private int id;
    private String userAccount;
    private String userPassword;
    private Date createTime;
    private Date updateTime;
    private int isStaff;
    private Timestamp timestamp;
}
