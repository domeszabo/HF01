package com.dd.gui;

import com.dd.DBGuiHF.model.Partners;
import java.util.List;
import javafx.scene.layout.Pane;


public class PartnersTable extends Table<Partners>
{
    
    public PartnersTable(Pane parent) 
    {
        super(parent);
        
        addColumn("Azonositó", "id", 5);
        addColumn("Partner neve", "name", 150);
        addColumn("Partner cime", "contact", 150);

    }
    
    public void setItems(List<Partners> partners)
    {
        var items = getItems();
        
        for(Partners partner : partners)
        {
            items.add(partner);
        }
    }
    
}
