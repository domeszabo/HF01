package com.dd.gui.forms;

import javafx.geometry.Insets;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


    public class InputField extends VBox
{
    private Label label;
    protected Control field;
    
    public InputField(String text)
    {
        Label label = new Label(text);
        field = createField();
        
        setSpacing(5);
        VBox.setMargin(this, new Insets(0, 0, 20, 0));
        
        getChildren().add(label);
        getChildren().add(field);
    }
    public InputField(String text, Pane parent)
    {
        this(text);
        parent.getChildren().add(this);
    }
    public String getValue()
    {
        TextInputControl control = (TextInputControl)field;
        return control.getText();
    }
    public void setValue(String value)
    {
        TextInputControl control = (TextInputControl)field;
        control.setText(value);
    }
    
    public void setPlaceholder(String placeholder)
    {
        TextInputControl control = (TextInputControl)field;
        control.setPromptText(placeholder);
    }
    
    protected Control createField()
    {
        return new TextField();
    }
}

