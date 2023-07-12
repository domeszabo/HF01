package com.dd.DBGuiHF.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "db__partners")
public class Partners 
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int Id;
    @Column(length = 100)
    private String name;
    private String contact;
    
    public Partners(String name, String contact)
    {
        //this.Id = Id;
        this.name = name;
        this.contact = contact;
    }
    public Partners() {}

    public int getId() 
    {
        return Id;
    }

    public String getName() 
    {
        return name;
    }

    public String getContact() 
    {
        return contact;
    }

    @Override
    public String toString() 
    {
        return "Partners{" + "id=" + Id + ", name=" + name + ", contact=" + contact + '}';
    }

    /*public void setId(int Id) 
    {
        this.Id = Id;
    }*/

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setContact(String contact) 
    {
        this.contact = contact;
    }
    
    
}
