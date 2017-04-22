package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	
	public LoginServlet() {
		super();
		
	}

	
	public void destroy() {
		super.destroy(); 
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(this.getClass());
		out.println(", using the POST method");
		String sno =request.getParameter("sno");
		String sname=request.getParameter("sname");
		String spass=request.getParameter("spass");
		out.println(sno+sname+spass);
		if(sno.equals("admin")&&spass.equals("admin")){
			HttpSession session = request.getSession(true) ; 
			session.setAttribute("sno",sno);
			session.setAttribute("spass",spass);
			request.getRequestDispatcher("resulty.jsp").forward(request, response);
		}else{
			response.sendRedirect("inputMessage.jsp");	
		}
		out.flush();
		out.close();
	}

	public void init() throws ServletException {
	}

}
