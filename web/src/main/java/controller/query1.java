package controller;
import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class query1 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/school";
		String user = "root";
		String password = "1234";
		String sql_1 = "select * from school.student";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);		
			PreparedStatement ps = conn.prepareStatement(sql_1);			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+
						  "\t"+rs.getString("name")+
						  "\t"+rs.getString("chi")+
						  "\t"+rs.getString("eng")+
						  "\t"+rs.getString("sum"));	
			} 							
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
			
		} catch(SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}
	}
}
