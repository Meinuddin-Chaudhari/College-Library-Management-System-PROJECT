package in.ineuron.library.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import in.ineuron.library.to.IssuedBookTO;

//Display issued Book per student control layer
@WebServlet(name="displayIssuedBookPerStudent",
			urlPatterns = {"/displayIssuedBookPerStudent.jlc"})
public class DisplayIssuedBookPerStudent extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterServlet-service()");
		// TODO Auto-generated method stub
		String page="";

		//2. Do Processing and prepare the response
		HttpSession session=request.getSession();
		List<IssuedBookTO> issuedBookList=issuedBookService.getAllIssuedBook();
		session.getServletContext().setAttribute("ISSUEDBOOKLISTWITHFINE", issuedBookList);
		page="DisplayIssuedBookPerStudent2.jsp";
		
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
