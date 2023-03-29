
package com.dd.hausaufgabe01;


public class Hausaufgabe01 {

    public static void main(String[] args) 
    {
            Wishlist wishlist = new Wishlist();
            
       
        wishlist.addItem(new Item("Laptop", 100000));
        wishlist.addItem(new Item("Telefon", 50000));
        wishlist.printItems();  // prints: Laptop - 100000 Ft (0%), Telefon - 50000 Ft (0%)

        wishlist.addSavedMoney(100000);
        System.out.println(wishlist.getSavedMoney());
        
        wishlist.printItems(); // prints: Laptop - 100000 Ft (100%), Telefon - 50000 Ft (100%)
    }
}
