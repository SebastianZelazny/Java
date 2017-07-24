/*package polaczenie;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

public class Connect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Scanner userInput = new Scanner(System.in);
		String sciezka = null;
		System.out.println("Podaj sciezke do podlaczenia sie bazy");
		
		sciezka = userInput.nextLine();
		
		try
		{
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://"+sciezka, "root", "Seb@stian1.");
			java.sql.Statement start = con.createStatement();
			ResultSet rs = start.executeQuery("Select * from logins");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3)+ " " +rs.getString(4)+" "+rs.getBoolean(5));
			}
			con.close();
		}
		catch (MySQLSyntaxErrorException e) {
			System.out.println("Podana sciezka jest nieprawidlowa");
		}
		catch (CommunicationsException e) {
			System.out.println("Podana sciezka jest nieprawidlowa");
		}
		
		

	}

}
*/