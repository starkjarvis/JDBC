package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class CreateDatabase 
{
	public static void main(String args[]) throws SQLException
	{
		String str1=JOptionPane.showInputDialog("Enter database name");
		
		String query="create database "+str1;
		System.out.println(query);
		PreparedStatement ps=DBInfo.con.prepareStatement(query);
		
		int i=ps.executeUpdate();
		System.out.println(i+" Database created!");
		ps.close();
		DBInfo.con.close();
		System.out.println("---End of Program---");
	}
}
