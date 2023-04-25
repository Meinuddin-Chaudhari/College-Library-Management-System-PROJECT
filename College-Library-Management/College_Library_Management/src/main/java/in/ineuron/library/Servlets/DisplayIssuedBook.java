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

//Display all issued Book control layer
@WebServlet(name="displayIssuedBook",
			urlPatterns = {"/displayIssuedBook.jlc"})
public class DisplayIssuedBook extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String msg="";
		String page="";
		
		//1. Collect input data
		
		//2. Do Processing and prepare the response
		ServletConfig servletConfig=getServletConfig();
		ServletContext servletContext=servletConfig.getServletContext();
		
		List<IssuedBookTO> issuedBookList=issuedBookService.getAllIssuedBook();
		servletContext.removeAttribute("ISSUEDBOOKLISTWITHFINE");
		servletContext.setAttribute("ISSUEDBOOKLISTWITHFINE",issuedBookList);
		
		
		if(issuedBookList.isEmpty()) {
			msg=msg+" Data not found ";
			request.setAttribute("MSG",msg);
			page="DisplayIssuedBook2.jsp";
		}else {
			page="DisplayIssuedBook2.jsp";
		}
		
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
