package Shob_RAj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	public Connection getDBconnection()
	{
		Connection conn=null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Registered successfully");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/EMP","root","9141639744");
			System.out.println("Connection successfull\n");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}	
		return conn;		
	}
}
