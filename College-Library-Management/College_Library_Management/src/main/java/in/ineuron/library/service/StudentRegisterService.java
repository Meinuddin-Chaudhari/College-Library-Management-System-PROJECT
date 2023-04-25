package in.ineuron.library.service;
import java.util.List;

import in.ineuron.library.to.StudentRegisterTO;
//Student register service layer
public interface StudentRegisterService {
	public int registerStudent(StudentRegisterTO studentRegisterTO);
	public StudentRegisterTO verifyStudent(String email,String password);
	public List<StudentRegisterTO> getAllRegisteredStudent();
}
