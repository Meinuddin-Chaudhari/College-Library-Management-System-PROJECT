package in.ineuron.library.service;

import java.util.List;

import in.ineuron.library.dao.AdminRegisterDAO;
import in.ineuron.library.dao.BookDAO;
import in.ineuron.library.dao.DAOFactory;
import in.ineuron.library.to.AdminRegisterTO;
import in.ineuron.library.to.BookTO;
//book service layer implementation
public class BookServiceImpl implements BookService {
	@Override
	public int addBook(BookTO bookTO) {
		BookDAO bookDAO=DAOFactory.getBookDAO();
		return bookDAO.addBook(bookTO);
	}

	@Override
	public List<BookTO> getAllBooks() {
		// TODO Auto-generated method stub
		BookDAO bookDAO=DAOFactory.getBookDAO();
		return bookDAO.getAllBooks();
	}

	@Override
	public int deleteBook(String bookId) {
		// TODO Auto-generated method stub
		BookDAO bookDAO=DAOFactory.getBookDAO();
		return bookDAO.deleteBook(bookId);
	}

	@Override
	public int updateBook(BookTO bookTO) {
		BookDAO bookDAO=DAOFactory.getBookDAO();
		return bookDAO.updateBook(bookTO);
	}
}
