package in.ineuron.library.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import in.ineuron.library.to.RequestedBookTO;
import in.ineuron.library.util.RowMapper;
//This will convert ResultSet into object 
public class RequestedBookRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		RequestedBookTO requestedBookTO=new RequestedBookTO();
		requestedBookTO.setBookId(rs.getInt(1));
		requestedBookTO.setStudentId(rs.getInt(2));
		return requestedBookTO;
	}
}
