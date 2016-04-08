package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class UpdateValues 
{
	public static void main(String args[]) throws SQLException
	{
		String str1=JOptionPane.showInputDialog("Enter the username to update the record");
		
		String str2=JOptionPane.showInputDialog("Enter new password");
		
		String str3=JOptionPane.showInputDialog("Enter new usertype");
		
		String query="update login set password=?,usertype=? where username=?";
		
		PreparedStatement ps= DBInfo.con.prepareStatement(query);
		
		ps.setString(1, str2);
		ps.setString(2, str3);
		ps.setString(3, str1);
		
		int i=ps.executeUpdate();
		
		System.out.println(i+" Record Updated !");
		ps.close();
		DBInfo.con.close();
		System.out.println("---End of program---");
	}
}
