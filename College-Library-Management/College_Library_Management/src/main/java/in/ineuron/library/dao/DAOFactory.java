package in.ineuron.library.dao;

//This this static references we can access DAO implemented class
public class DAOFactory {
	static StudentRegisterDAO studentRegisterDAO;
	static AdminRegisterDAO adminRegisterDAO;
	static BookDAO bookDAO;
	static RequestedBookDAO requestedBookDAO;
	static IssuedBookDAO issuedBookDAO;
	static AdminEmailIdDAO adminEmailIdDAO;
	static StudentEmailIdDAO studentEmailIdDAO;
	
	static {
		studentRegisterDAO =new StudentRegisterDAOImpl();
		adminRegisterDAO =new AdminRegisterDAOImpl();
		bookDAO =new BookDAOImpl();
		requestedBookDAO = new RequestedBookDAOImpl();
		issuedBookDAO = new IssuedBookDAOImpl();
		adminEmailIdDAO =new AdminEmailIdDAOImpl();
		studentEmailIdDAO =new StudentEmailIdDAOImpl();
	}
	
	public static StudentRegisterDAO getStudentRegisterDAO() {
		return studentRegisterDAO;
	}
	public static AdminRegisterDAO getAdminRegisterDAO() {
		return adminRegisterDAO;
	}
	public static BookDAO getBookDAO() {
		return bookDAO;
	}
	
	public static RequestedBookDAO getRequestedBookDAO() {
		return requestedBookDAO;
	}
	
	public static IssuedBookDAO getIssuedBookDAO() {
		return issuedBookDAO;
	}
	
	public static AdminEmailIdDAO getAdminEmailIdDAO() {
		return adminEmailIdDAO;
	}
	
	public static StudentEmailIdDAO getStudentEmailIdDAO() {
		return studentEmailIdDAO;
	}
}
