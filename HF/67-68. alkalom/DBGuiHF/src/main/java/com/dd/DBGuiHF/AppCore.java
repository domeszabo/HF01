package com.dd.DBGuiHF;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


public class AppCore extends Application
{
    
    @Override
    public void start(Stage stage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("app.fxml"));
        
        Scene scene = new Scene(loader.load(),640,480);
        stage.setScene(scene);
        stage.setTitle("Partnerek és bevételek");
        stage.show();
    }
    
     private static ConfigurableApplicationContext context;

    public static ConfigurableApplicationContext getContext() 
    {
        return context;
    }

    @Override
    public void init() throws Exception 
    {
        super.init();
        context = new SpringApplicationBuilder(DbGuiHfApplication.class).run();
    }
}
