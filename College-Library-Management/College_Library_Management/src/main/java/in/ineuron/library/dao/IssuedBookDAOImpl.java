package in.ineuron.library.dao;

import java.util.List;

import in.ineuron.library.to.IssuedBookTO;
import in.ineuron.library.util.JdbcTemplate;

//implementing IssuedBookDAO
public class IssuedBookDAOImpl implements IssuedBookDAO {
	@Override
	public int addIssuedBook(IssuedBookTO issuedBookTO) {
		String SQL="insert into IssuedBook(studentId,bookId,bookTitle,bookAuthor,bookCategory,borrowedDate,fineAmount) values(?,?,?,?,?,?,?)";
		int x=JdbcTemplate.update(SQL,issuedBookTO.getStudentId(),issuedBookTO.getBookId(),issuedBookTO.getBookTitle(),issuedBookTO.getBookAuthor(),issuedBookTO.getBookCategory(),issuedBookTO.getBorrowedDate(),issuedBookTO.getFineAmount());
		return x;
	}

	@Override
	public List<IssuedBookTO> getAllIssuedBook() {
		// TODO Auto-generated method stub
		String SQL="select * from IssuedBook;";
		List<IssuedBookTO> issuedBookList=JdbcTemplate.queryForList(SQL, new IssuedBookRowMapper());
		return issuedBookList;
	}

	@Override
	public int deleteIssuedBook(int studentId, int bookId) {
		// TODO Auto-generated method stub
		String SQL="delete from IssuedBook where studentId=? and bookId=?;";
		int x=JdbcTemplate.update(SQL, studentId,bookId);
		return x;
	}

	@Override
	public int addBorrowedBookFine(int fineAmount,int studentId,int bookId) {
		// TODO Auto-generated method stub
		String SQL="update IssuedBook set fineAmount=? where studentId=? and bookId=?;";
		int x=JdbcTemplate.update(SQL,fineAmount,studentId,bookId);
		return x;
	}

	@Override
	public int getBorrowedBookCounter(int studentId) {
		// TODO Auto-generated method stub
		String SQL="select count(bookId) from IssuedBook where studentId=?;";
		int x=JdbcTemplate.queryForInteger(SQL, studentId);
		return x;
	}
}
