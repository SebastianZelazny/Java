package jdbc2;

import java.io.FilterInputStream;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class DBConnectTest {

	
	public static void main(String[] args) throws SQLException{
		String user = "root";
		String pass = "Seb@stian1.";
		DBConnect dbcon = new DBConnect();
		try {
			dbcon = new DBConnect(user, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Nie masz danej klasy sterownika!!!");
			e.printStackTrace();
		} catch (SQLException e) {
			//System.out.println("Z³e dane logowania do bazy");
			System.err.println("Error: " + e);   
			  String sqlState = e.getSQLState();   
			  String message = e.getMessage();   
			  int errorCode = e.getErrorCode();   
			  System.out.println(sqlState + " err1");
			  System.out.println(message + " err2");
			  System.out.println(errorCode + " err3");

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		readTable(dbcon, "skoczek");
		writeToTable(dbcon, "skoczek");
		dbcon.closeConn();
		
		//readTable(dbcon, "skoczek");
	}
	
	
	static void writeToTable(DBConnect dbcon, String tableName){
		ArrayList<String[]> values = new ArrayList<>();
		ResultSet rs;
		Scanner rl = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close(){}
		});
		try {
			rs = dbcon.getTable(tableName);
			ResultSetMetaData md = rs.getMetaData();
			while(true){
				String[] valueString = new String[md.getColumnCount()];
				for(int i = 1; i<=md.getColumnCount(); i++){
				System.out.println("Wpisz " + rs.getMetaData().getColumnName(i));
				valueString[i-1] = rl.nextLine();
				//System.out.println(valueString[i-1]);
				}
				values.add(valueString);
				
				try
				{
					System.out.println("Czy chcesz prowadzadziæ dane yes/no?");
					String decyzja = rl.nextLine();
					
					if(decyzja.toLowerCase().equals("yes"));
					{
						dbcon.transactionTrue();
						dbcon.writeToTable(tableName, values);
						System.out.println("Wyslane");
						readTable(dbcon, "skoczek");
					}
					if(decyzja.toLowerCase().equals("no"))
					{
						dbcon.transactionFalse();
					}
				}
				catch (SQLException e2) {
					e2.printStackTrace();
				}
				System.out.println(" ");
				System.out.println("Chcesz dalej wprowadzaæ dane? t/n:");
				String deci = rl.nextLine();
				if(deci.toLowerCase().equals("n")){
					System.out.println("wyjsce");
					break;
					}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	static void readTable(DBConnect dbcon, String tableName){
		try {
			ResultSet rs = dbcon.getTable(tableName);
			ResultSetMetaData md = rs.getMetaData();
			for(int i = 1; i<=md.getColumnCount(); i++){
				System.out.printf("%20s" + "| \t", md.getColumnName(i));
			}
			System.out.println();
			for(int i = 1; i<=md.getColumnCount()+1; i++){
			System.out.print("=====================");
			}
			System.out.println();
			while(rs.next()){
				for(int i = 1; i<=md.getColumnCount(); i++){
					System.out.printf("%20s" + "| \t",rs.getObject(i).toString());
				}
				System.out.println();
				//System.out.println(rs.getInt(1)+ rs.getString(2) + rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
