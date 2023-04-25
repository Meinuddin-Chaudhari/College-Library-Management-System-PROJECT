package in.ineuron.library.Servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//search book control layer
@WebServlet(name="selectBookSearchOption", urlPatterns ="/selectBookSearchOption.jlc")
public class SelectBookSearchOption extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Collect input data 
		String option=request.getParameter("CATEGORY");
		System.out.println(option);
		//2. Do Processin
		String msg="";
		String page="";
		if(option==null || option.length()==0) {
			msg="Please select option";
			request.setAttribute("MSG", msg);
			page="SelectBookSearchOption.jsp";
		}else {
			request.setAttribute("OPTION", option);
			page="SelectBookSearchOption2.jsp";
		}
			
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
