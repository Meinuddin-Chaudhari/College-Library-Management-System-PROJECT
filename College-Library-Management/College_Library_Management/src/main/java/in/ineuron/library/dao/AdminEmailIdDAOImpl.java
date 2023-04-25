package in.ineuron.library.dao;
import java.util.List;
import in.ineuron.library.util.JdbcTemplate;

//librarian service requirement specification implementation
public class AdminEmailIdDAOImpl implements AdminEmailIdDAO {
	@Override
	public List getAllAdminEmailId() {
		// TODO Auto-generated method stub
		String SQL="select * from AdminEmailId;";
		List mylist=JdbcTemplate.queryForObjectList(SQL, new AdminEmailIdRowMapper());
		return mylist;
	}
}
