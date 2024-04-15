package com.example.temelio.requestType;

import java.util.ArrayList;

public class MailRequestType {
    private String foundation_id;
    private ArrayList<String> email_ids;
    public String getFoundation_id() {
        return foundation_id;
    }
    public void setFoundation_id(String foundation_id) {
        this.foundation_id = foundation_id;
    }
    public ArrayList<String> getEmail_ids() {
        return email_ids;
    }
    public void setEmail_ids(ArrayList<String> email_ids) {
        this.email_ids = email_ids;
    }
    public MailRequestType(String foundation_id, ArrayList<String> email_ids) {
        this.foundation_id = foundation_id;
        this.email_ids = email_ids;
    }
    public MailRequestType() {
    }
    @Override
    public String toString() {
        return "MailRequestType [foundation_id=" + foundation_id + ", email_ids=" + email_ids + "]";
    }
    
}
