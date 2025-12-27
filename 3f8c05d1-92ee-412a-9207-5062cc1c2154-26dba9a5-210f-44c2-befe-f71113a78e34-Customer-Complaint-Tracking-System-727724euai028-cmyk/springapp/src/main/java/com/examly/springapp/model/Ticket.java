package com.examly.springapp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {
    @Id
    private Long ticketId;
    public Ticket() {
    }
}
