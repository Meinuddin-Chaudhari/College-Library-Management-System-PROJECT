package in.ineuron.library.service;

import java.util.List;

import in.ineuron.library.dao.AdminRegisterDAO;
import in.ineuron.library.dao.DAOFactory;
import in.ineuron.library.dao.IssuedBookDAO;
import in.ineuron.library.to.AdminRegisterTO;
import in.ineuron.library.to.IssuedBookTO;

//Issued Book service layer implementation
public class IssuedBookServiceImpl implements IssuedBookService {
	@Override
	public int addIssuedBook(IssuedBookTO issuedBookTO) {
		// TODO Auto-generated method stub
		IssuedBookDAO issuedBookDAO=DAOFactory.getIssuedBookDAO();
		return issuedBookDAO.addIssuedBook(issuedBookTO);
	}

	@Override
	public List<IssuedBookTO> getAllIssuedBook() {
		// TODO Auto-generated method stub
		IssuedBookDAO issuedBookDAO=DAOFactory.getIssuedBookDAO();
		return issuedBookDAO.getAllIssuedBook();
	}

	@Override
	public int deleteIssuedBook(int studentId, int bookId) {
		// TODO Auto-generated method stub
		IssuedBookDAO issuedBookDAO=DAOFactory.getIssuedBookDAO();
		return issuedBookDAO.deleteIssuedBook(studentId, bookId);
	}

	@Override
	public int addBorrowedBookFine(int fineAmount,int studentId,int bookId) {
		// TODO Auto-generated method stub
		IssuedBookDAO issuedBookDAO=DAOFactory.getIssuedBookDAO();
		return issuedBookDAO.addBorrowedBookFine(fineAmount,studentId, bookId);
	}

	@Override
	public int getBorrowedBookCounter(int studentId) {
		// TODO Auto-generated method stub
		IssuedBookDAO issuedBookDAO=DAOFactory.getIssuedBookDAO();
		return issuedBookDAO.getBorrowedBookCounter(studentId);
	}
}
