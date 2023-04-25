package in.ineuron.library.service;

import java.util.List;

import in.ineuron.library.dao.DAOFactory;
import in.ineuron.library.dao.StudentRegisterDAO;
import in.ineuron.library.to.StudentRegisterTO;
//Student register service layer implementation
public class StudentRegisterServiceImpl implements StudentRegisterService {

	@Override
	public int registerStudent(StudentRegisterTO studentRegisterTO) {
		// TODO Auto-generated method stub
		StudentRegisterDAO studentRegisterDAO=DAOFactory.getStudentRegisterDAO();
		return studentRegisterDAO.registerStudent(studentRegisterTO);
	}

	@Override
	public StudentRegisterTO verifyStudent(String email, String password) {
		StudentRegisterDAO studentRegisterDAO=DAOFactory.getStudentRegisterDAO();
		return studentRegisterDAO.verifyStudent(email, password);
	}

	@Override
	public List<StudentRegisterTO> getAllRegisteredStudent() {
		// TODO Auto-generated method stub
		StudentRegisterDAO studentRegisterDAO=DAOFactory.getStudentRegisterDAO();
		return studentRegisterDAO.getAllRegisteredStudent();
	}
}
