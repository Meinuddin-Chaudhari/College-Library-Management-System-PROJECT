package in.ineuron.library.dao;
import java.util.List;
import in.ineuron.library.util.JdbcTemplate;

//librarian service requirement specification implementation
public class StudentEmailIdDAOImpl implements StudentEmailIdDAO {
	@Override
	public List getAllStudentEmailId() {
		// TODO Auto-generated method stub
		 String SQL="select * from StudentEmailId;";
		 List mylist=JdbcTemplate.queryForObjectList(SQL, new StudentEmailIdRowMapper());
		return mylist;
	}
}
