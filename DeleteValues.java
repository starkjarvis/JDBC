package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DeleteValues 
{
	public static void main(String args[]) throws SQLException
	{
			String str1=JOptionPane.showInputDialog("Enter username to delete the record");
			String query="delete from login where username=?";
			
			PreparedStatement ps = DBInfo.con.prepareStatement(query);
			ps.setString(1, str1);
			int i=ps.executeUpdate();
			
			System.out.println(i+" record deleted !");
			ps.close();
			DBInfo.con.close();
			System.out.println("--End of Program--");
	}
}
