package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;
public class add {
	public static void main(String[] args) throws SQLException {
		/*1.廠商提供Driver-->java api
		 *2.連上資料庫-->DriverManager 
		 *3.串接-->Connection
		 *4.Statement , PrepareStatement -->撰寫SQL 		 * 
		 */
		String url = "jdbc:mysql://localhost:3307/school";
		String user = "root";
		String password = "1234";
		String sql="insert into student(name,chi,eng,sum) values('abc',10,20,30)";		
		try {
			Class.forName("com.mysql.jdbc.Driver");	
//			DriverManager.getConnection(url, user, password);
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement st = (Statement) conn.createStatement();
			st.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			System.out.println("No Driver");
			e.printStackTrace();
		}
	}
}
