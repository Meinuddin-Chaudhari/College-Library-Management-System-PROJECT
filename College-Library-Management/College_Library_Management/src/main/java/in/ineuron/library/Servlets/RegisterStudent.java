package in.ineuron.library.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.library.to.AdminRegisterTO;
import in.ineuron.library.to.StudentRegisterTO;
//register student control layer
@WebServlet(name="studentRegistration",
			urlPatterns = {"/studentRegistration.jlc"})
public class RegisterStudent extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterStudentServlet-service()");
		// TODO Auto-generated method stub
		String msg="";
		String page="";
		
		//1. Collect input data
		String fullname=request.getParameter("fullname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String dob=request.getParameter("dob");
		String password1=request.getParameter("password1");
		String password2=request.getParameter("password2");
		
		if((fullname.length()==0 || (fullname.isEmpty()) || fullname==null) || (password1.length()==0 || (password1.isEmpty()) || password1==null) || (password2.length()==0 || (password2.isEmpty()) || password2==null) || (!password2.equals(password1)) || (phone.length()==0 || (phone.isEmpty()) || phone==null) || (dob.length()==0 || (dob.isEmpty()) || dob==null) ) {
			msg="Insert your field properly";
			page="RegisterStudent.jsp";
			request.setAttribute("MSG",msg);
		}else {
			StudentRegisterTO studentRegisterTO=new StudentRegisterTO();
			studentRegisterTO.setFullName(fullname);
			studentRegisterTO.setEmail(email);
			studentRegisterTO.setPhone(phone);
			studentRegisterTO.setDob(dob);
			studentRegisterTO.setPassword(password1);
			studentRegisterTO.setPassword(password1);
			
			int x=studentRegisterService.registerStudent(studentRegisterTO);
			
			if(x==0) {
				msg="Oops Registration failed";
				request.setAttribute("MSG",msg);
				page="RegisterStudent.jsp";
			}else {
				page="LoginStudent.jsp";
			}
			
		}
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
