package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import database.DBConnect;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.TableModel;

public class MainController {
	String Login="admin";
	String Passw="admin";
    @FXML
    private Label LBLInf;

    @FXML
    private Label LBLLog;

    @FXML
    private Label LBLPass;

    @FXML
    private TextField TxtFielLogin;

    @FXML
    private PasswordField PassField;

    @FXML
    private Button BtnLogin;

    @FXML
    private Button BtnClose;

    @FXML
    private Label LBLError;
    @FXML
    private TextField TxtFielPasss;
    
    @FXML
    private Button BtnCheckPass;
    public DBConnect dbcon;
    public void initialize()
    {
    	dbcon = new DBConnect();
    	BtnClose.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit(1);
				
			}
		});
    }

    @FXML
    void LoginToSys(MouseEvent event) throws IOException, ClassNotFoundException, SQLException {
    	Connection con = dbcon.connection();
    	ResultSet rs = con.createStatement().executeQuery("SELECT * from Logins");
    	while(rs.next())
    	{
	    	if(TxtFielLogin.getText().equals(rs.getString(2)) && (PassField.getText().equals(rs.getString(3))))
	    	{
	    		LBLError.setText("Logowanie przebieg³o pomyœlnie");
	    		Stage stageTable = new Stage();
	    		Parent root = (Parent) FXMLLoader.load(getClass().getResource("/view/TableView.fxml"));
				Scene scene = new Scene(root);
				stageTable.setScene(scene);
				stageTable.setTitle("Table Page");
				stageTable.show();
				TxtFielLogin.setText(null);
	    		TxtFielPasss.setText(null);
	    		PassField.setText(null);
	    	}
	    	else
	    	{
	    		LBLError.setText("B³êdny login lub has³o");
	    	}
    	}
    }
    @FXML
    void CheckPasswordPres(MouseEvent event) {
    	PassField.setVisible(false);
    	TxtFielPasss.setDisable(false);
    	TxtFielPasss.setText(PassField.getText());
    }
    
    @FXML
    void CheckPasswordRelase(MouseEvent event)
    {
    	TxtFielPasss.setDisable(true);
    	PassField.setVisible(true);
    }
  

}
