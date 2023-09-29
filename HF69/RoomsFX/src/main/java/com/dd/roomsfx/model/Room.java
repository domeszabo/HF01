package com.dd.roomsfx.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Room 
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  
  @ManyToOne
  private Sector sector;
  private char classification;
  private boolean open;

    public Room() {}

    public Room(int id, String name, Sector sector, char classification, boolean open) 
    {
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.classification = classification;
        this.open = open;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public Sector getSector() 
    {
        return sector;
    }

    public char getClassification() 
    {
        return classification;
    }

    public boolean isOpen() 
    {
        return open;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setSector(Sector sector) 
    {
        this.sector = sector;
    }

    public void setClassification(char classification) 
    {
        this.classification = classification;
    }

    public void setOpen(boolean open) 
    {
        this.open = open;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", name=" + name + ", sector=" + sector + ", classification=" + classification + ", open=" + open + '}';
    }
  
  
}
