package in.ineuron.library.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import in.ineuron.library.to.StudentRegisterTO;
import in.ineuron.library.util.RowMapper;

//this will convert resultset into object
public class StudentRegisterRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		StudentRegisterTO studentRegisterTO=new StudentRegisterTO();
		studentRegisterTO.setStudentId(rs.getInt(1));
		studentRegisterTO.setFullName(rs.getString(2));
		studentRegisterTO.setEmail(rs.getString(3));
		studentRegisterTO.setPhone(rs.getString(4));
		studentRegisterTO.setDob(rs.getString(5));
		studentRegisterTO.setPassword(rs.getString(6));
		return studentRegisterTO;
	}
}
