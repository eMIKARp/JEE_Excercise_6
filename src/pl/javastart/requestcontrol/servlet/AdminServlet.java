package pl.javastart.requestcontrol.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminServlet() {
        super();
    }

    
	
	/* Redirect Reqest
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println("AdminServlet GET " + username);
		response.sendRedirect("LoginServlet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println("AdminServlet POST " + username);
		response.sendRedirect("LoginServlet");
	}
	
	*/

    /* Forward Request
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println("AdminServlet GET " + username);
		request.getRequestDispatcher("LoginServlet").forward(request, response);
		response.getWriter().println("Tekst odpowiedzi po operacji forward()");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println("AdminServlet POST " + username);
		request.getRequestDispatcher("LoginServlet").forward(request, response);
		response.getWriter().println("Tekst odpowiedzi po operacji forward()");
	}
	
	*/
	
    // Include Request
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println("AdminServlet GET " + username);
		request.getRequestDispatcher("LoginServlet").include(request, response);
		response.getWriter().println("Tekst odpowiedzi po operacji include()");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println("AdminServlet POST " + username);
		request.getRequestDispatcher("LoginServlet").include(request, response);
		response.getWriter().println("Tekst odpowiedzi po operacji include()");
	}

}
