package com.oasis.mvc.dao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private BigDecimal sal;

    private Date birthday;

    public User(Integer id, String username, BigDecimal sal, Date birthday) {
        this.id = id;
        this.username = username;
        this.sal = sal;
        this.birthday = birthday;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}