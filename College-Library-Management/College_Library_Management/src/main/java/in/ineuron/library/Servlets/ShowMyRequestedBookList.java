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

//show requested book control layer
@WebServlet(name="showMyRequestedBookList",
			urlPatterns = {"/showMyRequestedBookList.jlc"})
public class ShowMyRequestedBookList extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterServlet-service()");
		// TODO Auto-generated method stub
		String msg="";
		String page="";
		
		//1. Collect input data
		
		//2. Do Processing and prepare the response
		HttpSession session=request.getSession();
		StudentRegisterTO studentRegisterTO=(StudentRegisterTO) session.getAttribute("STUDENTREGISTERTO");
		List<Integer> requestedBookIdList=requestedBookService.getRequestedBookIdList(studentRegisterTO.getStudentId());
		
		if(requestedBookIdList.isEmpty()) {
			msg=msg+"You have not requested any book till now ";
			session.removeAttribute("REQUESTEDBOOKIDLIST");
			request.setAttribute("MSG",msg);
			page="ShowMyRequestedBookList2.jsp";
		}else {
			session.setAttribute("REQUESTEDBOOKIDLIST", requestedBookIdList);
			page="ShowMyRequestedBookList2.jsp";
		}
		
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
