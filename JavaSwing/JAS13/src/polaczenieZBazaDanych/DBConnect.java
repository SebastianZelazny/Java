package polaczenieZBazaDanych;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect {
	
	private Connection con;
	private Statement stmt;
	String root = "root";
	String pass = "Seb@stian1.";
	
/*	public class MySuperExcep extends Exception
	{
		public void cosSieStalo()
		{
			System.out.println("Nie ma obiektu");
		}
	}*/
	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}
	
	private DBConnect(String login,String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Skoczkowie",login,password);
		stmt = con.createStatement();
		
		
	}


	public static DBConnect MakeConnection(String login,String password) throws MySuperExcep
	{
		try
		{
		DBConnect makeCon= new DBConnect(login, password);
		return makeCon;
		}
		catch (Exception e) {
			throw new MySuperExcep();
		}
		
	}
	ResultSet getTable(String tableName) throws SQLException
	{
		String query = "select * from " + tableName;
		ResultSet rs = stmt.executeQuery(query);
		return rs;		
	}
}
