package in.ineuron.library.Filters;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import in.ineuron.library.Servlets.IneuronBase;
import in.ineuron.library.to.AdminEmailIdTO;
import in.ineuron.library.to.StudentEmailIdTO;

@WebFilter(filterName="studentRegistration",urlPatterns ="/studentRegistration.jlc")
public class StudentEmailIdFilter extends IneuronBase implements Filter{
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("StudentEmailIdFilter-Static.Block");
	}
	
	public StudentEmailIdFilter() {
		System.out.println("StudentEmailIdFilter-Default.Constructor");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("StudentEmailIdFilter-init()");	
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
			boolean isValidEmailId=false;
			//Collecting input from client
			String email=request.getParameter("email").trim();
			
			List<StudentEmailIdTO> studentEmailIdList=studentEmailIdService.getAllStudentEmailId();
			for(StudentEmailIdTO studentEmailIdTO:studentEmailIdList) {
				//System.out.println("adminEmailId >>>> "+adminEmailIdTO.getEmailId());
				if(studentEmailIdTO.getEmailId().equals(email)) {
					isValidEmailId=true;
					break;
				}
				
			}
		
		
		if(isValidEmailId){
			chain.doFilter(request, response);//Invoke Next Component
		}else {
			String msg="Please enter college provided email id";
			request.setAttribute("MSG",msg);
			RequestDispatcher rd=request.getRequestDispatcher("RegisterStudent.jsp");
			rd.forward(request, response);
		}
		
		
		System.out.println("AddRequestedBookFilter-doFilter() - POST-Begin");
		System.out.println("AddRequestedBookFilter-doFilter() - POST-End");
		}
		
	
	public void destroy() {
		System.out.println("AddRequestedBookFilter-destroy()");
	}

}
