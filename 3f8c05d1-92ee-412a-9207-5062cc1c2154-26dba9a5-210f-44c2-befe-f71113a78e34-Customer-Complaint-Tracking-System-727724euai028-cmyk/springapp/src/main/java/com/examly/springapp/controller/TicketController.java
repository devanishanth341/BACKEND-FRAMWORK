package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Ticket;

@RestController

@RequestMapping("/api")
public class TicketController {
      
    @PostMapping
    public Ticket addTicket(@RequestBody Ticket ticketId){
        return ticketId;
    }
    
    @GetMapping
    public Ticket getTicketByticketId(@PathVariable Ticket ticketId){
        return ticketId;
    }
    @PutMapping
    public Ticket UpdateTicket(@PathVariable Ticket ticketId,@RequestBody Ticket Project){
        return Project;
    }
}

