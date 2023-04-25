package in.ineuron.library.service;

import java.util.List;

import in.ineuron.library.to.AdminRegisterTO;
import in.ineuron.library.to.BookTO;
//book service layer
public interface BookService {
	public int addBook(BookTO bookTO);
	public int deleteBook(String bookId);
	public List<BookTO> getAllBooks();
	public int updateBook(BookTO bookTO);
}
