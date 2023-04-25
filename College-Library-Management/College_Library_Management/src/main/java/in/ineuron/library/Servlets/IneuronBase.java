package in.ineuron.library.Servlets;

import javax.servlet.http.HttpServlet;

import in.ineuron.library.service.AdminEmailIdService;
import in.ineuron.library.service.AdminEmailIdServiceImpl;
import in.ineuron.library.service.AdminRegisterService;
import in.ineuron.library.service.AdminRegisterServiceImpl;
import in.ineuron.library.service.BookService;
import in.ineuron.library.service.BookServiceImpl;
import in.ineuron.library.service.IssuedBookService;
import in.ineuron.library.service.IssuedBookServiceImpl;
import in.ineuron.library.service.RequestedBookService;
import in.ineuron.library.service.RequestedBookServiceImpl;
import in.ineuron.library.service.StudentEmailIdService;
import in.ineuron.library.service.StudentEmailIdServiceImpl;
import in.ineuron.library.service.StudentRegisterService;
import in.ineuron.library.service.StudentRegisterServiceImpl;

//Centralized service reference
public class IneuronBase extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static StudentRegisterService studentRegisterService;
	public static AdminRegisterService adminRegisterService;
	public static BookService bookService;
	public static RequestedBookService requestedBookService;
	public static IssuedBookService issuedBookService;
	public static AdminEmailIdService adminEmailIdService;
	public static StudentEmailIdService studentEmailIdService;
	static {
		studentRegisterService = new StudentRegisterServiceImpl();
		adminRegisterService = new AdminRegisterServiceImpl();
		bookService =new BookServiceImpl();
		requestedBookService =new RequestedBookServiceImpl();
		issuedBookService =new IssuedBookServiceImpl();
		adminEmailIdService =new AdminEmailIdServiceImpl(); 
		studentEmailIdService=new StudentEmailIdServiceImpl();
	}
}
