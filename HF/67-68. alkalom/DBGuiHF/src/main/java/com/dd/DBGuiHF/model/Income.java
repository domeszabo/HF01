package com.dd.DBGuiHF.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "db__income")
public class Income 
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int Id;
    @ManyToOne
    @JoinColumn(name = "partner")
    private Partners partner;
    private int amount;
    @Column (length = 60)
    private String project;
    private String created;
    private String approved;
    
    

    public Income(int Id,Partners partner, int amount, String project, String created, String approved) 
    {
        this.Id = Id;
        this.partner = partner;
        this.amount = amount;
        this.project = project;
        this.created = created;
        this.approved = approved;
    }
    
    public Income(){}

    public int getId() 
    {
        return Id;
    }

    public Partners getPartner() 
    {
        return partner;
    }

    public int getAmount() 
    {
        return amount;
    }

    public String getProject() 
    {
        return project;
    }

    public String getCreated() 
    {
        return created;
    }

    public String getApproved() 
    {
        return approved;
    }
    
    public String getPartnerName()
    {
        return partner.getName();
    }

    @Override
    public String toString() 
    {
        return "Income{" + "Id=" + Id + ", partner=" + partner.getName() + ", amount=" + amount + ", project=" + project + ", created=" + created + ", approved=" + approved + '}';
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public void setPartner(Partners partner) {
        this.partner = partner;
    }
    
    
    
}
