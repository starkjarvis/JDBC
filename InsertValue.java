package jdbc;
import java.util.Scanner;
import java.sql.*;

import javax.swing.JOptionPane;

public class InsertValue extends DBInfo
{
	private static Scanner sc;

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		
		String str1=JOptionPane.showInputDialog("Enter username");
		
		
		String str2=JOptionPane.showInputDialog("Enter Password");
		
		
		String str3=JOptionPane.showInputDialog("Enter Usertype");
		
		String query="insert into login(username,password,usertype) values(?,?,?)";
		
		PreparedStatement ps= DBInfo.con.prepareStatement(query);
		
		ps.setString(1, str1);
		ps.setString(2, str2);
		ps.setString(3, str3);
		
		int i=ps.executeUpdate();
		System.out.println(i+"record inserted");
		ps.close();
		DBInfo.con.close();
		System.out.println("End of program.");
		
		
	}
}
