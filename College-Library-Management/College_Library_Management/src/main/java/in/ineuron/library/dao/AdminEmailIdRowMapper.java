package in.ineuron.library.dao;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.library.to.AdminEmailIdTO;
import in.ineuron.library.to.AdminRegisterTO;
import in.ineuron.library.util.RowMapper;

//It will convert resultset into object
public class AdminEmailIdRowMapper implements RowMapper {

	//This mapRow() method will ask ResultSet parameter and return Object
	@Override
	public Object mapRow(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		AdminEmailIdTO adminEmailIdTO=new AdminEmailIdTO();
		adminEmailIdTO.setEmailId(rs.getString(1));
		return adminEmailIdTO;
	}
}
