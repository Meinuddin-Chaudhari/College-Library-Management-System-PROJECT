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
//update book control layer
@WebServlet(name="updateBook",
			urlPatterns = {"/updateBook.jlc"})
public class UpdateBook extends IneuronBase {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegisterServlet-service()");
		// TODO Auto-generated method stub
		//1. Collect input data
		String bookIdString=request.getParameter("bookId");
		int bookId=Integer.parseInt(bookIdString);
		
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		String category=request.getParameter("category");
		
		
		//2. Do Processing and prepare the response
		BookTO bookTO=new BookTO();
		bookTO.setBookId(bookId);
		bookTO.setTitle(title);
		bookTO.setAuthor(author);
		bookTO.setCategory(category);
		
		int x=bookService.updateBook(bookTO);
		
		String msg="";
		String page="";
		if(x==0) {
			msg=msg+"Oops Book not updated";
			request.setAttribute("MSG",msg);
			page="UpdateBook.jsp";
			System.out.println("Book Not updated");
		}else {
			ServletConfig servletConfig=getServletConfig();
			ServletContext servletContext=servletConfig.getServletContext();
			List<BookTO> myList=bookService.getAllBooks();
			servletContext.setAttribute("BOOKLIST", myList);
			page="UpdateBook.jsp";
			System.out.println("Book updated");
		}
		//3. Forward
		RequestDispatcher rd=request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
