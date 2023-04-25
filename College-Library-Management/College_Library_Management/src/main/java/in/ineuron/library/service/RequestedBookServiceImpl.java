package in.ineuron.library.service;

import java.util.List;

import in.ineuron.library.dao.AdminRegisterDAO;
import in.ineuron.library.dao.BookDAO;
import in.ineuron.library.dao.DAOFactory;
import in.ineuron.library.dao.RequestedBookDAO;
import in.ineuron.library.to.AdminRegisterTO;
import in.ineuron.library.to.BookTO;
import in.ineuron.library.to.RequestedBookTO;

//requested book service layer implementation
public class RequestedBookServiceImpl implements RequestedBookService {
	@Override
	public int addBookRequest(RequestedBookTO requestedBookTO) {
		// TODO Auto-generated method stub
		RequestedBookDAO requestedBookDAO=DAOFactory.getRequestedBookDAO();
		return requestedBookDAO.addBookRequest(requestedBookTO);
	}

	
	@Override
	public int getBookRequestCounter(int studentId) {
		// TODO Auto-generated method stub
		RequestedBookDAO requestedBookDAO=DAOFactory.getRequestedBookDAO();
		return requestedBookDAO.getBookRequestCounter(studentId);
	}


	@Override
	public List<Integer> getRequestedBookIdList(int studentId) {
		// TODO Auto-generated method stub
		RequestedBookDAO requestedBookDAO=DAOFactory.getRequestedBookDAO();
		return requestedBookDAO.getRequestedBookIdList(studentId);
	}


	@Override
	public int removeBookRequest(int bookId, int studentId) {
		RequestedBookDAO requestedBookDAO=DAOFactory.getRequestedBookDAO();
		return requestedBookDAO.removeBookRequest(bookId, studentId);
	}


	@Override
	public List<RequestedBookTO> getAllBookRequest() {
		// TODO Auto-generated method stub
		RequestedBookDAO requestedBookDAO=DAOFactory.getRequestedBookDAO();
		return requestedBookDAO.getAllBookRequest();
	}
}
