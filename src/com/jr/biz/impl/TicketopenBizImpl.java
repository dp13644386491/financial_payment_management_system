package com.jr.biz.impl;

import com.jr.biz.ITicketopenBiz;
import com.jr.entry.Ticketopen;
import com.jr.until.SqlHelper;

import java.util.List;

public class TicketopenBizImpl implements ITicketopenBiz {
    /**
     * 获取符合条件的所有状态的开单信息（开单）
     * */
    @Override
    public List<Ticketopen> getAllByConditions(Ticketopen ticketopen, SqlHelper sqlHelper) {
        return null;
    }
    /**
     * 获取符合条件的开单中的开单信息（复核）
     * */
    @Override
    public List<Ticketopen> getAllByConditionsOnTheBill(Ticketopen ticketopen, SqlHelper sqlHelper) {
        return null;
    }
    /**
     * 添加开单信息
     * */
    @Override
    public int addTicket(Ticketopen ticketopen) {
        return 0;
    }
    /**
     *更改开单数据信息
     */
    @Override
    public Ticketopen upateTicketStatus(Ticketopen ticketopen) {
        return null;
    }
}
