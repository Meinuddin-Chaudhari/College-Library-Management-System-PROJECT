package in.ineuron.library.Servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import in.ineuron.library.to.IssuedBookTO;

//Confirm book request control layer
@WebServlet(name="confirmBookRequest",
			urlPatterns = {"/confirmBookRequest.jlc"})
public class ConfirmBookRequest extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1. Collect input data
		int bookId=Integer.parseInt(request.getParameter("bookId"));
		int studentId=Integer.parseInt(request.getParameter("studentId"));
		String bookTitle=request.getParameter("bookTitle");
		String bookAuthor=request.getParameter("bookAuthor");
		String bookCategory=request.getParameter("bookCategory");
		
		long millis=System.currentTimeMillis();  
        java.sql.Date borrowedDate=new java.sql.Date(millis);  
		
		IssuedBookTO issuedBookTO=new IssuedBookTO();
		issuedBookTO.setStudentId(studentId);
		issuedBookTO.setBookId(bookId);
		issuedBookTO.setBookTitle(bookTitle);
		issuedBookTO.setBookAuthor(bookAuthor);
		issuedBookTO.setBookCategory(bookCategory);
		issuedBookTO.setBorrowedDate(borrowedDate);
		issuedBookTO.setFineAmount(0);
		
		int y=issuedBookService.addIssuedBook(issuedBookTO);
		if(y==1) {
			int x=requestedBookService.removeBookRequest(bookId, studentId);
		}
		//2. Do Processing and prepare the response
		
		String msg="";
		String page="";
		if(y==0) {
			msg=msg+"Oops Request not confirm";
		}else {
			msg=msg+"Request confirmed";
		}
		HttpSession session=request.getSession();
		session.setAttribute("CONFIRMSTATUS", msg);
		page="IssueRequestedBook.jsp";
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
