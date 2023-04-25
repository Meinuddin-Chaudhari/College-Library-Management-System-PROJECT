package in.ineuron.library.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import in.ineuron.library.to.IssuedBookTO;
import in.ineuron.library.util.RowMapper;

//This will convert ResultSet into object
public class IssuedBookRowMapper implements RowMapper {
	@Override
	public Object mapRow(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		IssuedBookTO issuedBookTO=new IssuedBookTO();
		issuedBookTO.setStudentId(rs.getInt(1));
		issuedBookTO.setBookId(rs.getInt(2));
		issuedBookTO.setBookTitle(rs.getString(3));
		issuedBookTO.setBookAuthor(rs.getString(4));
		issuedBookTO.setBookCategory(rs.getString(5));
		issuedBookTO.setBorrowedDate(rs.getDate(6));
		issuedBookTO.setFineAmount(rs.getInt(7));
		
		return issuedBookTO;
	}
}
