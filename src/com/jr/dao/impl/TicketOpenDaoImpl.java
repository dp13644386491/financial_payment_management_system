package com.jr.dao.impl;

import com.jr.dao.ITicketOpenDao;
import com.jr.entry.Ticketopen;
import com.jr.until.DBHelper;
import com.jr.until.SqlHelper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TicketOpenDaoImpl implements ITicketOpenDao {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Ticketopen ticketopen1;
    /**
     * 获取符合条件的所有状态的开单信息（开单）
     * */
    @Override
    public List<Ticketopen> queryAllByConditions(Ticketopen ticketopen, SqlHelper sqlHelper) {
        return null;
    }
    /**
     * 查询符合条件的开单中的开单信息（复核）
     * */
    @Override
    public List<Ticketopen> queryAllByConditionsOnTheBill(Ticketopen ticketopen, SqlHelper sqlHelper) {
        return null;
    }
    /**
     * 添加开单信息
     * */
    @Override
    public int insertTicket(Ticketopen ticketopen) {
        return 0;
    }

    /**
     *更改列表信息
     */
    @Override
    public Ticketopen upateTicketStatus(Ticketopen ticketopen) {
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
