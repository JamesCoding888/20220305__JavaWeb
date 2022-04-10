package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class add2 {
	public static void main(String[] args) throws SQLException {
		/* 
		 * 1. 確定廠商提供 Driver --> Class.forName
		 * 2. DriverManageer --> 連線
		 * 3. Connection --> link --> JDBC -> preparedStatement --> SQL
		 */
		
		String url = "jdbc:mysql://localhost:3307/school";
		String user = "root";
		String password = "1234";
		String sql = "insert into school.student (name, chi, eng, sum) values(?, ?, ?, ?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "Lesson");
			ps.setInt(2, 80);
			ps.setInt(3, 90);
			ps.setInt(4, 100);
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			System.out.println("No Driver");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}
	}
}
