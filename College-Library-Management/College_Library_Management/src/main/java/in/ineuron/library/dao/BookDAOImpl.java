package in.ineuron.library.dao;
import in.ineuron.library.to.BookTO;
import java.util.List;
import in.ineuron.library.util.JdbcTemplate;
import in.ineuron.library.util.RowMapper;

//Implementing BookDAO interface
public class BookDAOImpl implements BookDAO {
	
	//add book
	@Override
	public int addBook(BookTO bookTO) {
		String SQL="insert into book(title,author,category) values(?,?,?)";
		int x=JdbcTemplate.update(SQL,bookTO.getTitle(),bookTO.getAuthor(),bookTO.getCategory());
		return x;
	}

	//deleteBook
	@Override
	public int deleteBook(String bookId) {
		// TODO Auto-generated method stub
		String SQL="delete from book where bookId=?;";
		int x=JdbcTemplate.update(SQL,bookId);
		return x;
	}
	
	//updateBook
	@Override
	public int updateBook(BookTO bookTO) {
		// TODO Auto-generated method stub
		String SQL="update book set title=? , author=? , category=? where bookId=?;";
		int x=JdbcTemplate.update(SQL,bookTO.getTitle(),bookTO.getAuthor(),bookTO.getCategory(),bookTO.getBookId());
		return x;
	}
	
	//Getting all Books
	@Override
	public List<BookTO> getAllBooks() {
		// TODO Auto-generated method stub
		String SQL="select * from book";
		RowMapper rowMapper=new BookRowMapper();
		List mylist=JdbcTemplate.queryForList(SQL, rowMapper);
		return mylist;
	}

	
}
