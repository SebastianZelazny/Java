package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnect {
	private Connection con;
	private Statement stmt;
	public Connection getCon() {
		return con;
	}
	

	public void setCon(Connection con) {
		this.con = con;
	}
	public DBConnect(){
		con = null;
		stmt = null;
	}
	public DBConnect(String adminUser, String pass) throws ClassNotFoundException, SQLException{

		Class.forName("com.mysql.jdbc.Driver");
		String conPath = "jdbc:mysql://localhost:3306/skoczkowie";
		con = DriverManager.getConnection(conPath, adminUser, pass);
		stmt = con.createStatement();
		con.setAutoCommit(false);
	}
	
	ResultSet getTable(String tableName) throws SQLException{
		String query = "select * from " + tableName;
		ResultSet rs = stmt.executeQuery(query);
		return rs;
		
	}
	void writeToTable(String tableName, ArrayList<String[]> values) throws SQLException{
		ResultSet rs = getTable(tableName);
		String columns = "";
		for(int i = 1; i<=rs.getMetaData().getColumnCount();i++){
			columns += rs.getMetaData().getColumnName(i);
			if(i != rs.getMetaData().getColumnCount()){
				columns += ",";
			}
		}
		for(String[] e: values){
			String valuesString = "";
			for(int i = 0; i<e.length;i++){
				valuesString += "\"" + e[i]  +"\""; 
				if(i != e.length-1){
					valuesString += ",";
				}
			}
		String insert = "insert into " + tableName +"( " + columns + " )" + " values ( " + valuesString + " )";
		//stmt.executeUpdate(insert);
		System.out.print(insert);
		stmt.executeUpdate(insert);
		}
	}
	void closeConn() throws SQLException{
		con.close();
	}
	void transactionTrue() throws SQLException
	{
		con.commit();
	}
	void transactionFalse() throws SQLException
	{
		con.rollback();
	}
	
}

	
