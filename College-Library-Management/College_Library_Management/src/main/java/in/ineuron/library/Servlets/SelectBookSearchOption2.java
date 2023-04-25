package in.ineuron.library.Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import in.ineuron.library.to.BookTO;
//search control layer
@WebServlet(name="selectBookSearchOption2", urlPatterns ="/selectBookSearchOption2.jlc")
public class SelectBookSearchOption2 extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Collect input data 
		Enumeration<String> enms=request.getParameterNames();
		List<String> enmsList=Collections.list(enms);
		
		ServletConfig servletConfig=getServletConfig();
		ServletContext servletContext=servletConfig.getServletContext();
		
		String msg="";
		String page="";
		
		List<BookTO> displayBookList=new ArrayList<>();
		List<BookTO> myBookList=(List<BookTO>) servletContext.getAttribute("BOOKLIST");
		for(String parameterName:enmsList) {
			
			String parameterValue=request.getParameter(parameterName);
			
			if(parameterValue==null || parameterValue.length()==0) {
				msg=msg+"Please select";
				request.setAttribute("MSG",msg);
				page="SelectBookSearchOption2.jsp";
			}else {
				
				if(parameterName.equals("BOOKID")) {
					int bookID=Integer.parseInt(parameterValue);
					for(BookTO bookDetails:myBookList) {
						if(bookDetails.getBookId()==bookID) {
							displayBookList.add(bookDetails);
							request.setAttribute("DISPLAYSEARCHBOOKLIST", displayBookList);
							break;
						}
					}
				}else if(parameterName.equals("TITLE")) {
					for(BookTO bookDetails:myBookList) {
						if(bookDetails.getTitle().equals(parameterValue)) {
							displayBookList.add(bookDetails);
						}
					}
					request.setAttribute("DISPLAYSEARCHBOOKLIST", displayBookList);
				}else if(parameterName.equals("AUTHOR")) {
					for(BookTO bookDetails:myBookList) {
						if(bookDetails.getAuthor().equals(parameterValue)) {
							displayBookList.add(bookDetails);
						}
					}
					request.setAttribute("DISPLAYSEARCHBOOKLIST", displayBookList);
				}else if(parameterName.equals("CATEGORY")) {
					for(BookTO bookDetails:myBookList) {
						if(bookDetails.getCategory().equals(parameterValue)) {
							displayBookList.add(bookDetails);
						}
					}
					request.setAttribute("DISPLAYSEARCHBOOKLIST", displayBookList);
				}
				page="DisplaySearchBook.jsp";
			}
		}
		
		
			
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
		
	}

}
