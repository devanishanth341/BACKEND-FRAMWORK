package com.examly.springapp.model;
import java.sql.Date;

import jakarta.persistence.*;

@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long commentId;
    private String content;
    private Date createdDate;
    @ManyToOne
    private Ticket ticket;
    public Comment() {
    }
    public Comment(String content, Date createdDate, Ticket ticket) {
        this.content = content;
        this.createdDate = createdDate;
        this.ticket = ticket;
    }
    public Long getCommentId() {
        return commentId;
    }
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
}
