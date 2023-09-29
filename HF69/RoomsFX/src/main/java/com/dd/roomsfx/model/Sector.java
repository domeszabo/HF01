
package com.dd.roomsfx.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "db__sector")
public class Sector 
{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private int accessLevel;

    public Sector() {}

    public Sector(int Id, String name, int accessLevel) 
    {
        this.Id = Id;
        this.name = name;
        this.accessLevel = accessLevel;
    }

    public int getId() 
    {
        return Id;
    }

    public String getName() 
    {
        return name;
    }

    public int getAccessLevel() 
    {
        return accessLevel;
    }

    public void setId(int Id) 
    {
        this.Id = Id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAccessLevel(int accessLevel) 
    {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return "Sector{" + "Id=" + Id + ", name=" + name + ", accessLevel=" + accessLevel + '}';
    }
    
    
    
}
