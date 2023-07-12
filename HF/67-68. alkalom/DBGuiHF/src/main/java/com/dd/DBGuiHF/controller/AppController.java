package com.dd.DBGuiHF.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class AppController implements Initializable
{
    PartnersController partnersController;
    IncomeController incomeController;
    
    
    @FXML
    private Label txtTable;
    @FXML
    private Pane container;
    
    @FXML
    void incomeActivity()
    {
        incomeController.listActivity();
    }
    
    @FXML
    void partnersActivity()
    {
        partnersController.listActivity();
    }
    @FXML 
    void income25Activity()
    {
      incomeController.Latestlist25Activity();
    }
    @FXML
    void latestIncome()
    {
        incomeController.latestActivity();
    }
    @FXML
    void noPayed()
    {
        incomeController.noPayedActivity();
    }
    @FXML
    void partnerProjectCount()
    {
        incomeController.partnerProyectActivity();
    }
    @FXML
    void newPartnerActivity()
    {
        partnersController.newActivity();
    }
    
    public void initView(String title)
    {
        txtTable.setText(title);
        container.getChildren().clear();
    }
    
    
    public Pane getContainer() 
    {
        return container;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        incomeController = new IncomeController(this);
        partnersController = new PartnersController(this);
        //incomeActivity();
    }
    
}
