package com.jr.biz;

import com.jr.entry.Ticketopen;
import com.jr.until.SqlHelper;

import java.util.List;

public interface ITicketopenBiz {
    /*
    * 获取符合条件的所有状态的开单信息（开单）
    * */
    public List<Ticketopen> getAllByConditions(Ticketopen ticketopen, SqlHelper sqlHelper);

    /*
    * 获取符合条件的开单中的开单信息（复核）
    * */
    public List<Ticketopen> getAllByConditionsOnTheBill(Ticketopen ticketopen, SqlHelper sqlHelper);

    /*
    * 添加开单信息
    * */
    public int addTicket(Ticketopen ticketopen);

    /**
     *更改开单数据信息
     */
    public Ticketopen upateTicketStatus(Ticketopen ticketopen);
}
