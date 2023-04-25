package in.ineuron.library.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import in.ineuron.library.to.AdminRegisterTO;

//admin login control layer
@WebServlet(name="adminLogin",
			urlPatterns = {"/adminLogin.jlc"})
public class LoginAdmin extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet-service()");
		// TODO Auto-generated method stub
		//1. Collect input data
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		//2. Do Processing and prepare the response
		AdminRegisterTO adminRegisterTO=adminRegisterService.verifyAdmin(email, password);
		
		String msg="";
		String page="";
		
		if(adminRegisterTO == null) {
			msg=msg+"Invalid Email or Password";
			request.setAttribute("MSG",msg);
			page="LoginAdmin.jsp";
		}else {
			HttpSession session=request.getSession();
			session.setAttribute("ADMINREGISTERTO",adminRegisterTO);
			System.out.println(adminRegisterTO);
			page="AdminIndex.jsp";
		}
		
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
