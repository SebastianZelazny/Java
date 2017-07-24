package controll;





import java.beans.EventHandler;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class GlownyController {

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl5;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private TextArea ta1;
    
    @FXML
    private CheckBox chb1;

    @FXML
    private CheckBox chb2;

    @FXML
    private CheckBox chb3;
    
    @FXML
    private RadioButton Rab1;

    @FXML
    private ToggleGroup Gr1;

    @FXML
    private RadioButton Rab2;

    @FXML
    private RadioButton Rab3;

    @FXML
    private RadioButton RaB4;
    
    ObservableList<String> Imiona = FXCollections.observableArrayList("Ala","Ola","Ada");
    
    
    @FXML
    private ComboBox<String> CoB1;
    
    @FXML
    private MenuItem Exit;

    @FXML
    private MenuItem Clear;

    @FXML
    private MenuItem About;
    
    @FXML
    void presMouse(MouseEvent event) {
    	ta1.setText("Nacisnales przycisk: "+btn1.getText());
    }
   
    @FXML
    void ToUpperCase(MouseEvent event) {
    	String txt = ta1.getText();
    	ta1.setText(txt.toUpperCase());
    }
    @FXML
    void ToLoverCase(MouseEvent event) {
    	String txt = ta1.getText();
    	ta1.setText(txt.toLowerCase());
    }
    
    @FXML
    void ClearAll(MouseEvent event) {
    	ta1.setText(null);
    }
    @FXML
    void Lbl1Entered(MouseEvent event) {
    	if(lbl1.isHover())
    	{
    		ta1.setText(lbl1.getText());
    	}
    	if(lbl2.isHover())
    	{
    		ta1.setText(lbl2.getText());
    	}
    	if(lbl3.isHover())
    	{
    		ta1.setText(lbl3.getText());
    	}
    	if(lbl4.isHover())
    	{
    		ta1.setText(lbl4.getText());
    	}
    	if(lbl5.isHover())
    	{
    		ta1.setText(lbl5.getText());
    	}
    }
    @FXML
    void LblExit(MouseEvent event) {
    	ta1.setText(null);
    }
    @FXML
    void CheckCheckBox(MouseEvent event) {
    	String text = "";
    	if(chb1.isSelected())
    	{
    		text+=chb1.getText()+"\n";
    	}
    	if(chb2.isSelected())
    	{
    		text+=chb2.getText()+"\n";
    	}
    	if(chb3.isSelected())
    	{
    		text+=chb3.getText()+"\n";
    	}
    	ta1.setText(text);
    }
    @FXML
    void ChechRadioB(MouseEvent event) {
    	ta1.setText(""+Gr1.getSelectedToggle());
    }
    
    private void initialize()
    {
    	//CoB1.setValue("Imiona");
    	CoB1.setItems(Imiona);
    	Clear.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				ta1.setText(null);
				
			}
		});
    }
    
    @FXML
    void CheckComboBox(MouseEvent event) {
    	ta1.setText(CoB1.getValue());
    }
   
    
}
