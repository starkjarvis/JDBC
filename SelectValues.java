package jdbc;
import java.sql.*;

public class SelectValues 
{
	public static void main(String args[])throws SQLException
	{
		String query="Select * from login";
		PreparedStatement ps=DBInfo.con.prepareStatement(query);
		
		ResultSet res=ps.executeQuery();
		
		while(res.next())
		{
			int i=res.getInt(1);
			String s1=res.getString(2);
			String s2=res.getString(3);
			String s3=res.getString(4);
			
			System.out.println(i+" : " + s1 +" : " +s2+ " : "+s3);
		}
		ps.close();
		DBInfo.con.close();
	}
}
