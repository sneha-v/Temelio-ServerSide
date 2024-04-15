package com.example.temelio.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FoundationNonprofitID implements Serializable {
    @Column(name = "foundation_id")
    private Integer FoundationId;
 
    @Column(name = "nonprofit_id")
    private Integer NonprofitId;

    @Column(name = "created_on")
    private Date createdOn;
    
    public FoundationNonprofitID() {
    }

    public FoundationNonprofitID(Integer foundationId, Integer nonprofitId) {
        FoundationId = foundationId;
        NonprofitId = nonprofitId;
    }

    public Integer getFoundationId() {
        return FoundationId;
    }

    public void setFoundationId(Integer foundationId) {
        FoundationId = foundationId;
    }

    public Integer getNonprofitId() {
        return NonprofitId;
    }

    public void setNonprofitId(Integer nonprofitId) {
        NonprofitId = nonprofitId;
    }

	
}
