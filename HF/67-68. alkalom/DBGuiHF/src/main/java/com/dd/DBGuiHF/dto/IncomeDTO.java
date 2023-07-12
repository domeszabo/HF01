package com.dd.DBGuiHF.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class IncomeDTO 
{
    @Id
    //@GeneratedValue (strategy = GenerationType.AUTO)
    private int Id;
    @Column (length = 60)
    private String partnerName;
    private int amount;
    private String created;
    private String project;
    private String approved;
    private String partnerContact;
    private long projectCounter;

    public IncomeDTO( String partnerName, int amount, String created, String approved) {
        
        this.partnerName = partnerName;
        this.amount = amount;
        this.created = created;
        this.approved = approved;
    }
    public IncomeDTO(){}
    
    public IncomeDTO( String partnerName, String partnerContact, String project, int amount, String created, String approved)
    {
        this.partnerName = partnerName;
        this.partnerContact = partnerContact;
        this.project = project;
        this.amount = amount;
        this.created = created;
        this.approved = approved;
    }
    
    public IncomeDTO(String partnerName, long projecCounter)
    {
        this.partnerName = partnerName;
        this.projectCounter = projectCounter;
    }
    public int getId() 
    {
        return Id;
    }
    
    public String getPartnerName() 
    {
        return partnerName;
    }

    public int getAmount() {
        return amount;
    }

    public String getCreated() 
    {
        return created;
    }

    public long getProjectCounter() 
    {
        return projectCounter;
    }
    
    

    public void setPartnerName(String partnerName) 
    {
        this.partnerName = partnerName;
    }

    public String getPartnerContact() 
    {
        return partnerContact;
    }
    
    public String getProject() 
    {
        return project;
    }

    public String getApproved() 
    {
        return approved;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public void setPartnerContact(String partnerContact) 
    {
        this.partnerContact = partnerContact;
    }

    public void setProjectCounter(long projectCounter) 
    {
        this.projectCounter = projectCounter;
    }
    
    
}
