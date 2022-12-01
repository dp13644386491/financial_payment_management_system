package com.jr.dao.impl;

import com.jr.dao.IUserDao;
import com.jr.entry.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaolmpl implements IUserDao {
    /**
     * 通过用户账号和用户密码查询指定用户，登入功能
     */
    @Override
    public User queryByAccountAndPassword() {
        return null;
    }
}
