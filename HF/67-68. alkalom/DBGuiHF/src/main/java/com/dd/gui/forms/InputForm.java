package com.dd.gui.forms;

import java.util.HashMap;
import java.util.function.Consumer;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class InputForm extends VBox
{
    protected HashMap<String, InputField> fields;
	
	public InputForm(Pane parent)
	{
		fields = new HashMap<>();
		
		parent.getChildren().add(this);
		VBox.setMargin(this, new Insets(0, 0, 30, 0));
	}
	
	public void add(String key, InputField field)
	{
		fields.put(key, field);
		getChildren().add(field);
	}
	public void button(String buttonText, Consumer<InputForm> onClick)
	{
		Button button = new Button(buttonText);
		getChildren().add(button);
		
		button.setOnAction(evt -> 
		{
			onClick.accept(this);
		});
	}
	
	public String getValue(String key)
	{
		if(fields.containsKey(key))
		{
			return fields.get(key).getValue();
		}
		return null;
	}
	public void setValue(String key, String value)
	{
		if(fields.containsKey(key))
		{
			fields.get(key).setValue(value);
		}
	}
	public void clear()
	{
		fields.forEach((key, field) -> 
		{
			field.setValue("");
		});
	}
}
