package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.student;
public class studentDao implements implDao {
	public static void main(String[] args) {
		// 連線測試
		System.out.println("=========== 連線測試 =========== ");
		System.out.println(implDao.getDB());
		// 新增-1
		System.out.println("=========== 新增-1 =========== ");
		new studentDao().add("c++", 1, 2, 3);
		// 新增-2 inject
		System.out.println("=========== 新增-2 =========== ");
		student s = new student("c#", "1", "2", "3");
		new studentDao().add(s);
		// 查詢
		System.out.println("=========== 查詢 ===========");
		System.out.println(new studentDao().query());
		System.out.println(new studentDao().query(20));		
	}

	@Override
	public void add(String name, Integer chi, Integer eng, Integer sum) {
		Connection conn = implDao.getDB();
		String sql = "insert into school.student (name, chi, eng, sum) values (?,?,?,?)";
		try {							
			PreparedStatement ps = conn.prepareStatement(sql);					
			ps.setString(1, name);
			ps.setInt(2, chi);
			ps.setInt(3, eng);
			ps.setInt(4, sum);
			ps.executeUpdate();							
		} catch(SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}	
	}

	@Override
	public void add(Object o) {
		Connection conn = implDao.getDB();
		String sql = "insert into school.student (name, chi, eng, sum) values (?,?,?,?)";
		student s = (student) o;
		try {							
			PreparedStatement ps = conn.prepareStatement(sql);					
			ps.setString(1, s.getName());
			ps.setString(2, s.getChi());
			ps.setString(3, s.getEng());
			ps.setString(4, s.getSum());
			ps.executeUpdate();							
		} catch(SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}				
	}

	@Override
	public String query() {
		Connection conn = implDao.getDB();
		String sql = "select * from school.student";
		String show =""; // 避免 null 被印出
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				show=show + rs.getInt("id") +"\t"
						  + rs.getString("name") +"\t"
						  + rs.getString("chi") +"\t"
						  + rs.getString("eng") +"\t"
						  + rs.getString("sum")+"\n";
			}
		} catch (SQLException e) {
			System.out.println("no connection");
			e.printStackTrace();
		}
		return show;
	}	
	
	@Override
	public String query(int id) {
		Connection conn=implDao.getDB();
		String sql="select * from student where id=?";
		String show="";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);			
			ResultSet rs=ps.executeQuery();			
			while(rs.next())
			{
				show=show + rs.getInt("id") +"\t"
						  + rs.getString("name") +"\t"
						  + rs.getString("chi") +"\t"
						  + rs.getString("eng") +"\t"
						  + rs.getString("sum")+"\n";
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		return show;
	}
}
