package com.jr.dao.impl;

import com.jr.dao.IEnterpriseDao;
import com.jr.entry.Enterprise;
import com.jr.until.DBHelper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EnterpriseDaoImpl implements IEnterpriseDao {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Enterprise enterprise1;
    /**
     * 根据企业id查询企业信息
      */
    @Override
    public Enterprise queryByid(int id) {
        return null;
    }
    /**
     *查询所有企业名称
     */
    @Override
    public List<Enterprise> queryAllEnterpriseNames() {
        return null;
    }

    /**
     *增删改通用方法
     */
    public int upd(String sql, Object... objs) {

        int num = 0;
        try {
            con = DBHelper.getconn();
            ps = con.prepareStatement(sql);
            for (int i = 0; i < objs.length; i++) {
                ps.setObject(i + 1, objs[i]);
            }
            num = ps.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBHelper.closeAll(rs, ps, con);
        }
        return num;
    }
}


