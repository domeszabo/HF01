package com.dd.gui;

import com.dd.DBGuiHF.model.Income;
import java.util.List;
import javafx.scene.layout.Pane;

public class IncomeTable extends Table<Income>
{
    
    public IncomeTable(Pane parent) 
    {
        super(parent);
        
        addColumn("Azonosito", "id", 5);
        addColumn("Parner azonosito", "partnerName", 150);
        addColumn("Osszeg", "amount", 8);
        addColumn("Project Neve", "project", 150);
        addColumn("Indulás", "created", 150);
        addColumn("Befejezés", "approved", 150);


    }
    
    public void setItems(List<Income> incomes)
    {
        var items = getItems();
        items.clear();
        
        for(Income income : incomes)
        {
            
            
            items.addAll(income);
        }
    }
    
}
