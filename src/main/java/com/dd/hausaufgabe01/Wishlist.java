
package com.dd.hausaufgabe01;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Wishlist 
{
    private List<Item> items;
    private double savedMoney;
    
   
    public Wishlist() 
    {
        this.items = new ArrayList<>();
        this.savedMoney = 0;
    }

    public void addItem(Item item) 
    {
        items.add(item);
    }

    public void addSavedMoney(double moneyToAdd) 
    {
        int itemCount = items.size();
        double moneyPerItem = moneyToAdd / itemCount;
       
        for (Item item : items)
        {
            item.addSavedPrice(moneyPerItem);
        }

        savedMoney += moneyToAdd;
        
    }

    public double getSavedMoney() 
    {
        return savedMoney;
    }

    
    public void printItems() 
    {
        for (Item item : items) 
        {
            System.out.println(item.getName() + " - " + item.getPrice() + " Ft (" + (int)(item.getSavedPrice() / item.getPrice() * 100) + "%)");
        }
    }

    public List<Item> getItems() 
    {
        return items;
    }
    
    public void removeItemsCompleted() 
    {
    Iterator<Item> iterator = items.iterator();

    while (iterator.hasNext()) 
    {
        Item item = iterator.next();

        if (item.getPrice() <= item.getSavedPrice()) 
        {
            iterator.remove();
        }
    }
}
    
}
