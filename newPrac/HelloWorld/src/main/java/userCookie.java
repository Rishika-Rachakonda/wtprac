

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class userCookie
 */
public class userCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c1 = new Cookie("user1","pwd1");
		Cookie c2 = new Cookie("user2","pwd1");
		Cookie c3 = new Cookie("user3","pwd1");
		Cookie c4 = new Cookie("user4","pwd1");
		
		response.addCookie(c4);
		response.addCookie(c3);
		response.addCookie(c2);
		response.addCookie(c1);
		
		
		String username = request.getParameter("unmae");
		String password = request.getParameter("password");
		
		Cookie []arr= request.getCookies();
		boolean auth = false ;
		for(Cookie c : arr) {
			if(c.getName().equals(username) && c.getValue().equals(password)) 
			{
			auth=true;
			break ;
			}
		}
		PrintWriter out = response.getWriter();
		out.println(username+" "+password);
		if(auth) {
			out.println("Welcome");
		}
		else {
			out.println("U idiot");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
