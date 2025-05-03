package Interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnector {
		public static void main(String[] args) throws SQLException {
			String localHost="localhost";
			String port="3306";
			Connection con=DriverManager.getConnection("jdbc:mysql://"+localHost+":"+port+"/emp", "root", "Amrutha@123#");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from employee");
			while(rs.next()) {
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("name"));
			
			}
		
		}
		
		
		
		
}
