package com.projectManagerApi.projectManagerApi.ws;


import com.projectManagerApi.projectManagerApi.bean.Ticket;
import com.projectManagerApi.projectManagerApi.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/tickets")
public class TicketWs {
    @Autowired
    private TicketService ticketService;
    @GetMapping("")
    public List<Ticket> findAll(){ return ticketService.findAll(); }

    @GetMapping("{id}")
    public Ticket findById(@PathVariable long id){ return ticketService.findById(id);}

    @PostMapping("")
    public Ticket save(@RequestBody Ticket ticket){ return ticketService.save(ticket); }

    @DeleteMapping("delete/{id}")
    public  void deleteById(@PathVariable long id){ ticketService.DeleteById(id); }

    @PutMapping("{id}")
    public Ticket update(@PathVariable long id, @RequestBody Ticket t){
        return ticketService.update(id, t);
    }

}