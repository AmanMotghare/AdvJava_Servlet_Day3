

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormAction
 */
@WebServlet("/FormAction")
public class FormClass extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 response.setContentType("text/html");
//		 PrintWriter out = response.getWriter();
//		 
//		 out.print("Heyy, I am Servlet (GET)... <br>");
//		 
//		 String Name = request.getParameter("uname");
//		 String Password = request.getParameter("upass");
//		 String Address = request.getParameter("address");
//		 
//		 out.print("<br>Name : "+Name);
//		 out.print("<br>Password : "+Password);
//		 out.print("<br>Address : "+Address);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 
		 out.print("Heyy, I am Servlet (POST)... <br>");
		 
		 String Name = request.getParameter("uname");
		 String Password = request.getParameter("upass");
		 String Address = request.getParameter("address");
		 
		 out.print("<br>Name : "+Name);
		 out.print("<br>Password : "+Password);
		 out.print("<br>Address : "+Address);
		 
		 out.print("<br><a href = 'index.html'> Go Back </a>");
	}

}
