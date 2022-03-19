package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public interface implDao {
	// 連線方法
	static Connection getDB() {
		String url = "jdbc:mysql://localhost:3307/school";
		String user = "root";
		String password = "1234";
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
			e.printStackTrace();
			// 
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}
		return conn;
	}
	// 新增
	public void add(String name, Integer chi, Integer eng, Integer sum);	
	public void add(Object o);
	// 修改
	String query(); // 全部
	String query(int id);
	
	// 刪除
}
