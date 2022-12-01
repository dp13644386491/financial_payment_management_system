package com.jr.dao;


import com.jr.entry.Ticketopen;
import com.jr.until.SqlHelper;

import java.util.List;

public interface ITicketOpenDao {
    /*
     * 查询符合条件的所有状态的开单信息（开单）
     * */
    public List<Ticketopen> queryAllByConditions(Ticketopen ticketopen, SqlHelper sqlHelper);

    /*
     * 查询符合条件的开单中的开单信息（复核）
     * */
    public List<Ticketopen> queryAllByConditionsOnTheBill(Ticketopen ticketopeN,SqlHelper sqlHelper);

    /*
     * 添加开单信息
     * */
    public int insertTicket(Ticketopen ticketopen);
    /**
     *更改开单数据信息
     */
    public Ticketopen upateTicketStatus(Ticketopen ticketopen);

}
