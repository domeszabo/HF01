package com.dd.DBGuiHF.controller;

import com.dd.DBGuiHF.AppCore;
import com.dd.DBGuiHF.dto.IncomeDTO;
import com.dd.DBGuiHF.model.Income;
import com.dd.DBGuiHF.model.Model;
import com.dd.gui.IncomeDTOTable;
import com.dd.gui.IncomeTable;
import com.dd.gui.LatestIncomeDTOTable;
import com.dd.gui.PartnersWithProjectsTable;
import java.util.List;


public class IncomeController 
{
    private AppController parent;
    private Model model;
    
    public IncomeController(AppController parent)
    {
        this.parent = parent;
        model = AppCore.getContext().getBean(Model.class);
    }
    
    public void listActivity()
    {
        parent.initView("Incomes");
        List<Income> incomes = model.getIncomes();
        
        IncomeTable table = new IncomeTable(parent.getContainer());
        table.setItems(incomes);
    }
    
    public void Latestlist25Activity()
    {
        parent.initView("Legutóbbi 25 bevétel");
        List<IncomeDTO> incomeDTO = model.getLatest25IncomeDTOs();
        
        IncomeDTOTable table = new IncomeDTOTable(parent.getContainer());
        table.setItems(incomeDTO);
    }
    
    public void latestActivity()
    {
        parent.initView("Utolsó bevétel");
        List<IncomeDTO> incomeDTO = model.getLatestActivity();
        
        LatestIncomeDTOTable table = new LatestIncomeDTOTable(parent.getContainer());
        table.setItems(incomeDTO);
    }
    
    public void noPayedActivity()
    {
        parent.initView("Legutóbbi 25 bevétel");
        List<IncomeDTO> incomeDTO = model.getNoPayed();
        
        IncomeDTOTable table = new IncomeDTOTable(parent.getContainer());
        table.setItems(incomeDTO);
    }
    
    public void partnerProyectActivity()
    {
        parent.initView("Partnerek és Projectek");
        List<IncomeDTO> incomeDTO = model.getPartnersProjectCount();
        
        PartnersWithProjectsTable table = new PartnersWithProjectsTable(parent.getContainer());
        table.setItems(incomeDTO);
    }
}
