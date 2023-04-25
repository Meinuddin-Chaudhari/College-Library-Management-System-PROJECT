package in.ineuron.library.Filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import in.ineuron.library.Servlets.IneuronBase;

@WebFilter(filterName="addRequestedBook",urlPatterns ="/addRequestedBook.jlc")
public class AddRequestedBookFilter extends IneuronBase implements Filter{
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("AddRequestedBookFilter-Static.Block");
	}
	
	public AddRequestedBookFilter() {
		System.out.println("AddRequestedBookFilter-Default.Constructor");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("AddRequestedBookFilter-init()");	
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String msg="";
		String page="";
		
		System.out.println("AddRequestedBookFilter-doFilter() - PRE-Begin");
		String studentId_str=request.getParameter("studentId");
		
		//Collecting studentId
		int studentId=Integer.parseInt(studentId_str);
		//fetching student book request 
		int bookRequestCounter=requestedBookService.getBookRequestCounter(studentId);
		//fetching how many book borrowed by student with the help of studentId
		int issuedBookCounter=issuedBookService.getBorrowedBookCounter(studentId);
		
		System.out.println("AddRequestedBookFilter-doFilter() - PRE-End");
		//each pupil to allow only 3 books
		if((bookRequestCounter+issuedBookCounter)<3) {
			chain.doFilter(request, response);//Invoke Next Component
		}
		else {
			msg=msg+"You can not submit more than 3 request ";
			request.setAttribute("MSG",msg);
			page="RequestBookOption.jsp";
			
			//3. Forward
			RequestDispatcher rd=request.getRequestDispatcher(page);
			rd.forward(request, response);
		}
		System.out.println("AddRequestedBookFilter-doFilter() - POST-Begin");
		System.out.println("AddRequestedBookFilter-doFilter() - POST-End");
	}
	
	public void destroy() {
		System.out.println("AddRequestedBookFilter-destroy()");
	}

}
