package controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/java/testController") // 超連結名稱 
public class testController extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	public testController() {
		super();
	}
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
//		response.setCharacterEncoding("UTF-8");
//		System.out.println("Get process");
//	}
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
//		response.setCharacterEncoding("UTF-8"); 
//		System.out.println("Post process");
//	}			
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	response.setCharacterEncoding("BIG5"); 
    	String name = request.getParameter("name");
    	String password = request.getParameter("password");    	
    	PrintWriter out = response.getWriter();
    	out.printf("name: %s, password: %s", name, password);    	
    	System.out.println("service process");
	}
}
