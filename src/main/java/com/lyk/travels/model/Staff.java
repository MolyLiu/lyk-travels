package com.lyk.travels.model;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Slf4j
public class Staff implements Serializable {

    private int id;
    private String staffAccount;
    private String staffPassword;
    private String createUser;
    private String upadateUser;
    private Date createTime;
    private Date updateTime;
    private Timestamp timestamp;

}
