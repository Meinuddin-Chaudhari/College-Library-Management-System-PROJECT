package in.ineuron.library.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import in.ineuron.library.to.RequestedBookTO;
import in.ineuron.library.to.StudentRegisterTO;
//find requested book controller layer
@WebServlet(name="issueRequestedBook",
			urlPatterns = {"/issueRequestedBook.jlc"})
public class IssueRequestedBook extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1. Collect input data
		
		
		//2. Do Processing and prepare the response
		HttpSession session=request.getSession();
		List<StudentRegisterTO> studentRegisterList=studentRegisterService.getAllRegisteredStudent();
		session.setAttribute("STUDENTLIST", studentRegisterList);
		
		List<RequestedBookTO> requestedBookList=requestedBookService.getAllBookRequest();
		session.setAttribute("REQUESTEDBOOKLIST", requestedBookList);
		String page="IssueRequestedBook2.jsp";
		
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
