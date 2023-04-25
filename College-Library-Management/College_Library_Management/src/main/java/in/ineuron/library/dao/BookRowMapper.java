package in.ineuron.library.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import in.ineuron.library.to.BookTO;
import in.ineuron.library.util.RowMapper;

//This will convert resultSet into BookTO
public class BookRowMapper implements RowMapper {
	@Override
	public Object mapRow(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		BookTO bookTO=new BookTO();
		bookTO.setBookId(rs.getInt(1));
		bookTO.setTitle(rs.getString(2));
		bookTO.setAuthor(rs.getString(3));
		bookTO.setCategory(rs.getString(4));
		return bookTO;
	}
}
