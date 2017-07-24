package controller;

import database.DBConnect;

import java.awt.JobAttributes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.TableModel;

import org.omg.CORBA.INITIALIZE;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class TableController {

    @FXML
    private Button BtnShow;
    @FXML
    private Button BtnInsert;
    @FXML
    private Button BtnUpdate;
    @FXML
    private Button BtnDelete;
    @FXML
    public TableView<TableModel> Tabview;
    @FXML
    private TableColumn<TableModel, Integer> TCLp;
    @FXML
    private TableColumn<TableModel, String> TCImie;
    @FXML
    private TableColumn<TableModel, String> TCNazwiko;
    @FXML
    private TableColumn<TableModel, String> TCPensja;
    @FXML
    private TextField TFImie;

    @FXML
    private TextField TFNazwisko;

    @FXML
    private TextField TFPensja;

    @FXML
    private Label LblImie;

    @FXML
    private Label LblNazwisko;

    @FXML
    private Label LblPensja;
    @FXML
    private Button BtnSend;
    @FXML
    private Button BtnUpdate2;
    @FXML
    private Label LblInfo2;
    public void initialize()
    {
    	dbcon = new DBConnect();
    }
    
    public DBConnect dbcon;
    
    public ObservableList<TableModel> data;
    
    @FXML
    void ShowTable(MouseEvent event) throws ClassNotFoundException, SQLException {
    	data = FXCollections.observableArrayList();
    	Connection con = dbcon.connection();
    	ResultSet rs = con.createStatement().executeQuery("SELECT * from employee");
    	while(rs.next())
    	{
    		data.add(new TableModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			//System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3)+ " " +rs.getString(4));
			
    	}
    	
    	TCLp.setCellValueFactory(new PropertyValueFactory<TableModel,Integer>("id"));
    	TCImie.setCellValueFactory(new PropertyValueFactory<TableModel,String>("FirstName"));
    	TCNazwiko.setCellValueFactory(new PropertyValueFactory<TableModel,String>("LastName"));
    	TCPensja.setCellValueFactory(new PropertyValueFactory<TableModel,String>("Salary"));
    	
    	Tabview.setItems(null);
    	Tabview.setItems(data);
    	//data.clear();
    	
    	TFImie.setVisible(false);
    	TFNazwisko.setVisible(false);
    	TFPensja.setVisible(false);
    	LblImie.setVisible(false);
    	LblNazwisko.setVisible(false);
    	LblPensja.setVisible(false);
    	BtnInsert.setVisible(false);
    }
    
    @FXML
    void DELETETable(MouseEvent event) throws SQLException, ClassNotFoundException{
    	int del = 0;
    	PreparedStatement preparedStatement = null;
    	try
    	{
    		del = Tabview.getSelectionModel().getSelectedItem().getId();
    		Connection con = dbcon.connection();
    	    String sql = "DELETE From employee where LP = "+del+";";
    	    preparedStatement = con.prepareStatement(sql);
    	    preparedStatement.executeUpdate();
    	}
    	catch (Exception e) 
    		{
        		System.out.println("Nie wybra³eœ ¿adnego rekordu do usuniêcia ");
        	}
    		
    	
    }

    @FXML
    void INSERTTable(MouseEvent event) {
    	TFImie.setVisible(true);
    	TFNazwisko.setVisible(true);
    	TFPensja.setVisible(true);
    	LblImie.setVisible(true);
    	LblNazwisko.setVisible(true);
    	LblPensja.setVisible(true);
    	BtnInsert.setVisible(true);
    	BtnUpdate2.setDisable(true);
    	BtnUpdate2.setVisible(false);
    	LblInfo2.setText("Wprowadz Dane");
    }
    @FXML
    void PushToTable(MouseEvent event) {
    	
    	if(TFImie.getText().equals("") || TFNazwisko.getText().equals("") || TFPensja.getText().equals(""))
    	{
    		LblInfo2.setText("Proszê uzupe³niæ wszystkie pola");
    	}
    	else
    	{
	    	String Sql2 = "Insert into employee(Imie,Nazwisko,Pensja) values(?,?,?);";
	    	PreparedStatement preparedStatement = null;
	    	Connection con;
			try {
				con = dbcon.connection();
				preparedStatement = con.prepareStatement(Sql2);
				preparedStatement.setString(1, TFImie.getText());
				preparedStatement.setString(2, TFNazwisko.getText());
				preparedStatement.setString(3, TFPensja.getText());
		    	preparedStatement.executeUpdate();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    	TFImie.setText(null);
	    	TFNazwisko.setText(null);
	    	TFPensja.setText(null);
    	}
    }

    @FXML
    void UPDATETable(MouseEvent event) {
    	TFImie.setVisible(true);
    	TFNazwisko.setVisible(true);
    	TFPensja.setVisible(true);
    	LblImie.setVisible(true);
    	LblNazwisko.setVisible(true);
    	LblPensja.setVisible(true);
    	BtnInsert.setVisible(false);
    	BtnUpdate2.setDisable(false);
    	BtnUpdate2.setVisible(true);
    	LblInfo2.setText("Update Dane");
    	try
    	{
	    	TFImie.setText(Tabview.getSelectionModel().getSelectedItem().getFirstName());
	    	TFNazwisko.setText(Tabview.getSelectionModel().getSelectedItem().getLastName());
	    	TFPensja.setText(Tabview.getSelectionModel().getSelectedItem().getSalary());
    	}
    	catch (Exception e) {
    		
    		System.out.println("Nie wybra³eœ rekordu do Upgrade");
		}
    	
    }
    @FXML
    void UpdateT(MouseEvent event) throws ClassNotFoundException, SQLException {
    	PreparedStatement preparedStatement = null;
    	Connection con;
    	try
    	{
	    	int update =Tabview.getSelectionModel().getSelectedItem().getId();
	    	String SqlUpdate = "UPDATE employee Set imie= ?,nazwisko= ?,pensja= ? where LP= "+update+";";
	    	con = dbcon.connection();
	    	preparedStatement = con.prepareStatement(SqlUpdate);
			preparedStatement.setString(1, TFImie.getText());
			preparedStatement.setString(2, TFNazwisko.getText());
			preparedStatement.setString(3, TFPensja.getText());
	    	preparedStatement.executeUpdate();
    	}
    	catch (Exception e) {
			System.out.println("Nie wybra³eœ rekordu do Upgradu");
		}
    	TFImie.setText(null);
    	TFNazwisko.setText(null);
    	TFPensja.setText(null);
    }

}
