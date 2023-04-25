package in.ineuron.library.dao;

import java.util.List;

import in.ineuron.library.to.StudentRegisterTO;
import in.ineuron.library.util.JdbcTemplate;

//implementing StudentRegisterDAO
public class StudentRegisterDAOImpl implements StudentRegisterDAO {
	@Override
	public int registerStudent(StudentRegisterTO studentRegisterTO) {
		// TODO Auto-generated method stub
		String SQL="insert into student(fullname,email,phone,dob,password) values(?,?,?,?,?)";
		int x=JdbcTemplate.update(SQL,studentRegisterTO.getFullName(),studentRegisterTO.getEmail(),studentRegisterTO.getPhone(),studentRegisterTO.getDob(),studentRegisterTO.getPassword());
		return x;
	}

	@Override
	public StudentRegisterTO verifyStudent(String email, String password) {
		String SQL="select * from student where email=? and password=?";
		Object obj=JdbcTemplate.queryForObject(SQL, new StudentRegisterRowMapper(), email,password);
		return (StudentRegisterTO) obj;
	}

	@Override
	public List<StudentRegisterTO> getAllRegisteredStudent() {
		// TODO Auto-generated method stub
		String SQL="select * from student";
		List obj=JdbcTemplate.queryForList(SQL, new StudentRegisterRowMapper());
		return obj;
	}
}
