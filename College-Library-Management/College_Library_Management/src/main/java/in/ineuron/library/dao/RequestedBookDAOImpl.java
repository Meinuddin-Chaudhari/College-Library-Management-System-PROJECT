package in.ineuron.library.dao;
import java.util.List;

import in.ineuron.library.to.RequestedBookTO;
import in.ineuron.library.util.JdbcTemplate;

//implementing RequestedBookDAO interface
public class RequestedBookDAOImpl implements RequestedBookDAO {
	@Override
	public int addBookRequest(RequestedBookTO requestedBookTO) {
		// TODO Auto-generated method stub
		String SQL="insert into RequestedBook(bookId,studentId) values(?,?)";
		int x=JdbcTemplate.update(SQL,requestedBookTO.getBookId(),requestedBookTO.getStudentId());
		return x;
	}

	@Override
	public int getBookRequestCounter(int studentId) {
		String SQL="select count(bookId) from RequestedBook where studentId=?;";
		int x=JdbcTemplate.queryForInteger(SQL, studentId);
		return x;
	}

	@Override
	public List<Integer> getRequestedBookIdList(int studentId) {
		// TODO Auto-generated method stub
		String SQL="select bookId from RequestedBook where studentId=?;";
		int x=JdbcTemplate.queryForInteger(SQL, studentId);
		List<Integer> list=JdbcTemplate.queryForIntegerList(SQL, studentId);
		return list;
	}

	@Override
	public int removeBookRequest(int bookId, int studentId) {
		String SQL="delete from RequestedBook where bookId=? and studentId=?;";
		int x=JdbcTemplate.update(SQL,bookId,studentId);
		return x;
	}

	@Override
	public List<RequestedBookTO> getAllBookRequest() {
		// TODO Auto-generated method stub
		String SQL="select * from RequestedBook order by studentId;";
		 List obj=JdbcTemplate.queryForList(SQL, new RequestedBookRowMapper());
		return obj;
	}
}
