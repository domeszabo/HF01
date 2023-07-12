package com.dd.gui;

import com.dd.DBGuiHF.dto.IncomeDTO;
import java.util.List;
import javafx.scene.layout.Pane;


public class IncomeDTOTable extends Table<IncomeDTO>
{
    
    public IncomeDTOTable(Pane parent) 
    {
        super(parent);
        
        
        addColumn("Partner neve", "partnerName", 150);
        addColumn("Megbizás összege", "amount", 10);
        addColumn("Indulás", "created", 100);
        addColumn("Befejezés", "approved", 100);
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
