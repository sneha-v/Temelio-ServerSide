package com.example.temelio.entity;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "MAIL")
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
 
    @ManyToOne
	@JoinColumn(name="foundation_id")
	private Foundation foundation;
 
    @ManyToOne
	@JoinColumn(name="nonprofit_id")
	private NonProfit nonprofit;
 
    @Column(name = "created_on")
    private Date createdOn;

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public NonProfit getNonprofit() {
        return nonprofit;
    }

    public void setNonprofit(NonProfit nonprofit) {
        this.nonprofit = nonprofit;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Mail(Foundation foundation, NonProfit nonprofit) {
        this.foundation = foundation;
        this.nonprofit = nonprofit;
    }
    
    public Mail() {
    }

    @PrePersist
    void createdOn() {
    this.createdOn = new Date();
    }
    
}