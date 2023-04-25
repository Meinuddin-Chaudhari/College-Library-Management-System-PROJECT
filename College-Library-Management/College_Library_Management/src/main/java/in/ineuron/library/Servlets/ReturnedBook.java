package in.ineuron.library.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import in.ineuron.library.to.IssuedBookTO;
//Returned book control layer
@WebServlet(name="bookReturned",
			urlPatterns = {"/bookReturned.jlc"})
public class ReturnedBook extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ReturnedBookServlet-service()");
		// TODO Auto-generated method stub
		//1. Collect input data
		int studentId=Integer.parseInt(request.getParameter("studentId"));
		int bookId=Integer.parseInt(request.getParameter("bookId"));
		
		
		//2. Do Processing and prepare the response
		int x=issuedBookService.deleteIssuedBook(studentId, bookId);
		
		String msg="";
		String page="";
		if(x==0) {
			msg=msg+"Oops Book not returned";
			request.setAttribute("MSG",msg);
			page="DisplayIssuedBook2.jsp";
		}else {
			ServletConfig servletConfig=getServletConfig();
			ServletContext servletContext=servletConfig.getServletContext();
	
			List<IssuedBookTO> myIssuedBookList=(List<IssuedBookTO>) servletContext.getAttribute("ISSUEDBOOKLISTWITHFINE");
			for(IssuedBookTO issuedBookDetails:myIssuedBookList) {
				if(issuedBookDetails.getStudentId()==studentId && issuedBookDetails.getBookId()==bookId) {
					myIssuedBookList.remove(issuedBookDetails);
					break;
				}
			}
			servletContext.setAttribute("ISSUEDBOOKLISTWITHFINE", myIssuedBookList);
			page="DisplayIssuedBook2.jsp";
		}
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
