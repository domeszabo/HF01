package com.dd.hausaufgabe01;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WishlistTest {
    
    public WishlistTest() {
    }

    @Test
    public void testAddItem() {
        Wishlist wishlist = new Wishlist();
        wishlist.addItem(new Item("Laptop", 100000));
        assertEquals(1, wishlist.getItems().size());
    }

    @Test
    public void testAddSavedMoney() {
        Wishlist wishlist = new Wishlist();
        wishlist.addItem(new Item("Laptop", 100000));
        wishlist.addItem(new Item("Telefon", 50000));
        wishlist.addSavedMoney(100000);

        // Hozzáadott összeg megfelelő
        assertEquals(100000, wishlist.getSavedMoney(), 0);
        // assertEquals(50000, wishlist.getSavedMoney(), 0);

        //Hozzá lettek adva a megfelelő tételek
        //assertEquals(100000, wishlist.getItems().get(0).getSavedPrice(), 0);
        assertEquals(50000, wishlist.getItems().get(1).getSavedPrice(), 0);

        // Törlődnek a listából a meglévő tételek
        //assertEquals(0, wishlist.getItems().size());
    }
   
    
@Test
    public void testRemoveItem() {
        Wishlist wishlist = new Wishlist();
        Item laptop = new Item("Laptop", 100000);
        Item phone = new Item("Telefon", 50000);
        
        wishlist.addItem(laptop);
        wishlist.addItem(phone);
        
        wishlist.addSavedMoney(100000);
        
        wishlist.removeItemsCompleted();
        
        assertEquals(1, wishlist.getItems().size());
        assertEquals(laptop, wishlist.getItems().get(0));
    }
    
}
