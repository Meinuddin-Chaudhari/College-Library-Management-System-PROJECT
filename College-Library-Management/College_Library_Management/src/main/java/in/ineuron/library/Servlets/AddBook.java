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
//add book control layer
@WebServlet(name="addBook",
			urlPatterns = {"/addBook.jlc"})
public class AddBook extends IneuronBase {
	private static final long serialVersionUID = 1L;
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1. Collect input data
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		String category=request.getParameter("category");
		
		
		//2. Do Processing and prepare the response
		BookTO bookTO=new BookTO();
		bookTO.setTitle(title);
		bookTO.setAuthor(author);
		bookTO.setCategory(category);
		
		int x=bookService.addBook(bookTO);
		
		String msg="";
		String page="";
		if(x==0) {
			msg=msg+"Oops Book not added";
			request.setAttribute("MSG",msg);
			page="AddBook.jsp";
		}else {
			ServletConfig servletConfig=getServletConfig();
			ServletContext servletContext=servletConfig.getServletContext();
			List<BookTO> myList=bookService.getAllBooks();
			servletContext.setAttribute("BOOKLIST", myList);
			page="AdminIndex.jsp";
		}
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
