package com.dd.gui.view;

import com.dd.DBGuiHF.model.Partners;
import com.dd.gui.forms.InputField;
import com.dd.gui.forms.InputForm;
import java.util.function.Consumer;
import javafx.scene.layout.Pane;


public class PartnerForm extends InputForm
{
    private Partners instance;
    public PartnerForm(Pane parent) 
    {
        super(parent);
        
        add("name", new InputField("Partner neve"));
        add("contact", new InputField("Kapcsolat adatai"));
        
        instance = null;
    }
    
    public void setValues(Partners partner)
    {
        setValue("name", partner.getName());
        setValue("contact", partner.getContact());
        
        instance = null;
    }
    
    public void submit(String buttonText, Consumer<Partners> onClick) 
    {
        button(buttonText, form ->
        {
            if(instance == null)
            {
                instance = new Partners();
            }
            
            instance.setName(form.getValue("name"));
            instance.setContact(form.getValue("contact"));
            
            
            onClick.accept(instance);
            instance = null;
        });
    }
}
