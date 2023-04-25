package in.ineuron.library.dao;
import in.ineuron.library.to.AdminRegisterTO;
import in.ineuron.library.util.JdbcTemplate;

//librarian service requirement specification implementation
public class AdminRegisterDAOImpl implements AdminRegisterDAO {

	//Registering new librarian as admin
	@Override
	public int registerAdmin(AdminRegisterTO adminRegisterTO) {
		// TODO Auto-generated method stub
		//preparing sql query
		String SQL="insert into admin(fullname,email,password) values(?,?,?)";
		//performing update operation with given parameters
		int x=JdbcTemplate.update(SQL,adminRegisterTO.getFullName(),adminRegisterTO.getEmail(),adminRegisterTO.getPassword());
		//status of operation
		return x;
	}

	//credential validation
	@Override
	public AdminRegisterTO verifyAdmin(String email, String password) {
		//preparing sql query
		String SQL="select * from admin where email=? and password=?";
		//performing select operation with given parameters
		Object obj=JdbcTemplate.queryForObject(SQL, new AdminRegisterRowMapper(), email,password);
		//result of operation
		return (AdminRegisterTO) obj;
	}
}
