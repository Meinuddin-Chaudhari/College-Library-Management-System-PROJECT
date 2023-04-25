package in.ineuron.library.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import in.ineuron.library.to.StudentEmailIdTO;
import in.ineuron.library.util.RowMapper;

//It will convert resultset into object
public class StudentEmailIdRowMapper implements RowMapper {

	//This mapRow() method will ask ResultSet parameter and return Object
	@Override
	public Object mapRow(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		StudentEmailIdTO studentEmailIdTO=new StudentEmailIdTO();
		studentEmailIdTO.setEmailId(rs.getString(1));
		return studentEmailIdTO;
	}
}
