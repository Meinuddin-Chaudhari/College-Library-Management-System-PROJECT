package in.ineuron.library.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import in.ineuron.library.to.StudentRegisterTO;
//Remove book request control layer
@WebServlet(name="removeBookRequest",
			urlPatterns = {"/removeBookRequest.jlc"})
public class RemoveBookRequest extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterServlet-service()");
		// TODO Auto-generated method stub
		//1. Collect input data
		String bookId=request.getParameter("bookId");
		int bookID=Integer.parseInt(bookId);
		
		HttpSession session=request.getSession();
		StudentRegisterTO StudentRegisterTO=(StudentRegisterTO)session.getAttribute("STUDENTREGISTERTO");
		int studentId=StudentRegisterTO.getStudentId();
		
		//2. Do Processing and prepare the response
		int x=requestedBookService.removeBookRequest(bookID, studentId);
		
		String msg="";
		String page="";
		if(x==0) {
			msg=msg+"Oops Request not remove";
			request.setAttribute("MSG",msg);
			page="ShowMyRequestedBookList2.jsp";
		}else {
			List<Integer> requestedBookIdList=(List<Integer>) session.getAttribute("REQUESTEDBOOKIDLIST");
			for(Integer myRequestedBookIdList:requestedBookIdList) {
				if(myRequestedBookIdList==bookID) {
					requestedBookIdList.remove(myRequestedBookIdList);
					break;
				}
			}
			session.setAttribute("REQUESTEDBOOKIDLIST", requestedBookIdList);
			page="ShowMyRequestedBookList2.jsp";
		}
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
