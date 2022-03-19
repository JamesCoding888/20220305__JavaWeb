package controller;
import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class updateEx {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/school";
		String user = "root";
		String password = "1234";
//		String sql = "update school.student set name=?, chi=?, eng=?, sum=? where id=?";
		String sql = "delete from school.student where id=? ";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);		
			PreparedStatement ps = conn.prepareStatement(sql);			
			ps.setInt(1, 21);			
			ps.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
			
		} catch(SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}
	}
}
