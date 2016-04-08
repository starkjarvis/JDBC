package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DropDatabase 
{
	public static void main(String args[]) throws SQLException
	{
		String str1=JOptionPane.showInputDialog("Enter database name to be dropped");
		
		String query="drop database "+str1;
		System.out.println(query);
		PreparedStatement ps=DBInfo.con.prepareStatement(query);
		
		int i=ps.executeUpdate();
		System.out.println(i+" Database dropped!");
		ps.close();
		DBInfo.con.close();
		System.out.println("---End of Program---");
	}
}