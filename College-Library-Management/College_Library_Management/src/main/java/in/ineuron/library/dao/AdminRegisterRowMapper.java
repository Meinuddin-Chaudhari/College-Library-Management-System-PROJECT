package in.ineuron.library.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import in.ineuron.library.to.AdminRegisterTO;
import in.ineuron.library.util.RowMapper;

//It will convert resultset into object
public class AdminRegisterRowMapper implements RowMapper {

	//This mapRow() method will ask ResultSet parameter and return Object
	@Override
	public Object mapRow(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		AdminRegisterTO adminRegisterTO=new AdminRegisterTO();
		adminRegisterTO.setAdminId(rs.getInt(1));
		adminRegisterTO.setFullName(rs.getString(2));
		adminRegisterTO.setEmail(rs.getString(3));
		adminRegisterTO.setPassword(rs.getString(4));
		return adminRegisterTO;
	}
}
