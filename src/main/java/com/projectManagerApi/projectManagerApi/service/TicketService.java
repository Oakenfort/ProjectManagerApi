package com.projectManagerApi.projectManagerApi.service;


import com.projectManagerApi.projectManagerApi.bean.Ticket;
import com.projectManagerApi.projectManagerApi.dao.TicketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketDao ticketDao;

    public Ticket save(Ticket t){
        return ticketDao.save(t);
    }

    public Ticket findById(long along){
        return ticketDao.findById(along).get();
    }

    public void DeleteById(Long along){
        ticketDao.deleteById(along);
    }
    public List<Ticket> findAll(){
        return ticketDao.findAll();

    }

    public Ticket update(long id, Ticket t){
        Ticket tt = new Ticket();
        tt = this.findById(id);
        tt.setTitle(t.getTitle());
        tt.setStartDate(t.getStartDate());
        tt.setEndDate(t.getEndDate());
        tt.setStatus(t.getStatus());
        tt.setLastModified(t.getLastModified());
        this.save(tt);
        return tt;

    }




}
