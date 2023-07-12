package com.dd.gui;

import com.dd.DBGuiHF.dto.IncomeDTO;
import com.dd.DBGuiHF.model.Income;
import java.util.List;
import javafx.scene.layout.Pane;

public class PartnersWithProjectsTable extends Table<IncomeDTO>
{
    
    public PartnersWithProjectsTable(Pane parent) 
    {
        super(parent);
        
        addColumn("Partner neve", "partnerName", 150);
        addColumn("Project száma", "projectCounter", 150);
    }
    
    public void setItems(List<IncomeDTO> incomesdto)
    {
        var items = getItems();
        items.clear();
        
        for(IncomeDTO incomedto : incomesdto)
        {
            items.add(incomedto);
        }
    }
    
}
