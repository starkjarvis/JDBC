package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBInfo 
{
	static Connection con;
	
	static
	{
		String url="jdbc:mysql://localhost:3306/college";
		String uname="yourUsername";
		String pass="yourPass";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,uname,pass);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Driver Loaded.");
		
	}
}