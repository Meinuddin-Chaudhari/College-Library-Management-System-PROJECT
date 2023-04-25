package in.ineuron.library.service;

import java.util.List;

import in.ineuron.library.dao.AdminEmailIdDAO;
import in.ineuron.library.dao.AdminRegisterDAO;
import in.ineuron.library.dao.DAOFactory;
import in.ineuron.library.dao.StudentEmailIdDAO;
import in.ineuron.library.to.AdminRegisterTO;

//admin service layer implementation
public class StudentEmailIdServiceImpl implements StudentEmailIdService {
	@Override
	public List getAllStudentEmailId() {
		// TODO Auto-generated method stub
		StudentEmailIdDAO studentEmailIdDAO=DAOFactory.getStudentEmailIdDAO();
		return studentEmailIdDAO.getAllStudentEmailId();
	}
}
