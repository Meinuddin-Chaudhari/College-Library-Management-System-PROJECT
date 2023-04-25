package in.ineuron.library.dao;
import java.util.List;
import in.ineuron.library.to.StudentRegisterTO;
//Registering student service requirement specification
public interface StudentRegisterDAO {
	public int registerStudent(StudentRegisterTO studentRegisterTO);
	public StudentRegisterTO verifyStudent(String email,String password);
	public List<StudentRegisterTO> getAllRegisteredStudent();
}
