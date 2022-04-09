package controller;
import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.studentDao;
import model.student;
@WebServlet("/addController")
public class addController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*1.request接收
		 *2.new student物件 
		 *3.新增資料庫-->add(o);
		 *4.response-->換頁
		 * 
		 */
		req.setCharacterEncoding("utf-8"); // 修改中文問題
		String name = req.getParameter("name");
		String chi = req.getParameter("chi");
		String eng = req.getParameter("eng");
		String sum = req.getParameter("sum");
		
		student s = new student(name, chi, eng, sum);
		new studentDao().add(s);
		
		resp.sendRedirect("finish.html");		 
	}
}
