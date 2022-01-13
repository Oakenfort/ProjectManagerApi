package com.projectManagerApi.projectManagerApi.dao;


import com.projectManagerApi.projectManagerApi.bean.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketDao extends JpaRepository<Ticket, Long> {

}
