package com.dd.DBGuiHF.controller;

import com.dd.DBGuiHF.AppCore;
import com.dd.DBGuiHF.model.Model;
import com.dd.DBGuiHF.model.Partners;
import com.dd.gui.PartnersTable;
import com.dd.gui.view.PartnerForm;
import java.util.List;


public class PartnersController 
{
    private AppController parent;
    private Model model;
    
    
    public PartnersController(AppController parent)
    {
        this.parent = parent;
        model = AppCore.getContext().getBean(Model.class);
        
    }
    
    public void listActivity()
    {
        parent.initView("Partners");
        List<Partners> partners = model.getPartners();
        
        PartnersTable table = new PartnersTable(parent.getContainer());
        table.setItems(partners);
        
        table.addActionColumn("...", (partner, index) ->
        {
            editPartner(partner);
        });
        
        table.addActionColumn("x",(partner, index) ->
        {
            model.delete(partner);
            listActivity();
        });
    }
    
    public void newActivity()
    {
        parent.initView("Uj partner");
        
        PartnerForm form = new PartnerForm(parent.getContainer());
        form.submit("Letrehozas", partner ->
        {
            model.save(partner);
            form.clear();
        });
    }
    public void editPartner(Partners partner)
    {
        parent.initView("Partner szerkesztese");
        
        PartnerForm form = new PartnerForm(parent.getContainer());
        form.setValues(partner);
        form.submit("SAVE", proj ->
        {
            model.save(proj);
        });
    }
}
