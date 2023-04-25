package in.ineuron.library.dao;
import in.ineuron.library.to.BookTO;
import java.util.List;
//book service requirement specification
public interface BookDAO {
	//A. Update operations
	public int addBook(BookTO bookTO);
	public int deleteBook(String bookId);
	public int updateBook(BookTO bookTO);
	
	//C. Select operations(0 or more records)
	public List<BookTO> getAllBooks();

}
