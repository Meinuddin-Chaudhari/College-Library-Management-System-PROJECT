package in.ineuron.library.Servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import in.ineuron.library.to.RequestedBookTO;

//add requested book control layer
@WebServlet(name="addRequestedBook",
			urlPatterns = {"/addRequestedBook.jlc"})
public class AddRequestedBook extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1. Collect input data
		String msg="";
		String page="";
		
		String bookId_str=request.getParameter("bookId");
		int bookId=Integer.parseInt(bookId_str);
		
		String studentId_str=request.getParameter("studentId");
		int studentId=Integer.parseInt(studentId_str);
		
		//2. Do Processing and prepare the response
		RequestedBookTO requestedBookTO=new RequestedBookTO(); 
		requestedBookTO.setBookId(bookId);
		requestedBookTO.setStudentId(studentId);
		
		int x=requestedBookService.addBookRequest(requestedBookTO);
		
		if(x==0) {
			msg=msg+"You have already added this request";
			request.setAttribute("MSG",msg);
			page="RequestBookOption.jsp";
		}else {
			msg=msg+"Request  added";
			request.setAttribute("MSG",msg);
			page="RequestBookOption.jsp";
		}
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
