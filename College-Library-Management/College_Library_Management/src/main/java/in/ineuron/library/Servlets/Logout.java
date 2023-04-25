package in.ineuron.library.Servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//logout control layer
@WebServlet(
			name="logout",
			urlPatterns = "/logout.jlc"
		)
public class Logout extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LogoutServlet-service()");
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		session.invalidate();
		String page="Header.jsp";
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
