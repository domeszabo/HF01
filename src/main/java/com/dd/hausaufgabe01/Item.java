package com.dd.hausaufgabe01;



public class Item 
{
        private String name;
        private double price;
        private double savedPrice;
        
        Wishlist wishlist = new Wishlist();

        public Item(String name, double price) 
        {
            this.name = name;
            this.price = price;
            this.savedPrice = 0;
        }
        public Item()
        {
            
        }

        public String getName() 
        {
            return name;
        }

        public double getPrice() 
        {
            return price;
        }

        public double getSavedPrice() 
        {
            return savedPrice;
        }

        public void addSavedPrice(double savedPriceToAdd) //Megtakarított pénz hozzáadása
        {
            savedPrice += savedPriceToAdd;
            
        }
}