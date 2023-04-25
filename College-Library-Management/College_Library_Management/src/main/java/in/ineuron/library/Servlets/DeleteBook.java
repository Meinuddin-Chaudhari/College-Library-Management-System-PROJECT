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
import in.ineuron.library.to.BookTO;
//Delete book control layer
@WebServlet(name="deleteBook",
			urlPatterns = {"/deleteBook.jlc"})
public class DeleteBook extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterServlet-service()");
		// TODO Auto-generated method stub
		//1. Collect input data
		String bookId=request.getParameter("bookId");
		int bookID=Integer.parseInt(bookId);
		
		//2. Do Processing and prepare the response
		int x=bookService.deleteBook(bookId);
		
		String msg="";
		String page="";
		if(x==0) {
			msg=msg+"Oops Book not deleted";
			request.setAttribute("MSG",msg);
			page="DeleteBook.jsp";
		}else {
			ServletConfig servletConfig=getServletConfig();
			ServletContext servletContext=servletConfig.getServletContext();
	
			List<BookTO> myBookList=(List<BookTO>) servletContext.getAttribute("BOOKLIST");
			for(BookTO bookDetails:myBookList) {
				if(bookDetails.getBookId()==bookID) {
					myBookList.remove(bookDetails);
					break;
				}
			}
			servletContext.setAttribute("BOOKLIST", myBookList);
			page="DeleteBook.jsp";
		}
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
