package in.ineuron.library.service;

import in.ineuron.library.dao.AdminRegisterDAO;
import in.ineuron.library.dao.DAOFactory;
import in.ineuron.library.to.AdminRegisterTO;

//admin service layer implementation
public class AdminRegisterServiceImpl implements AdminRegisterService {
	@Override
	public int registerAdmin(AdminRegisterTO adminRegisterTO) {
		// TODO Auto-generated method stub
		AdminRegisterDAO adminRegisterDAO=DAOFactory.getAdminRegisterDAO();
		return adminRegisterDAO.registerAdmin(adminRegisterTO);
	}
	@Override
	public AdminRegisterTO verifyAdmin(String email, String password) {
		AdminRegisterDAO adminRegisterDAO=DAOFactory.getAdminRegisterDAO();
		return adminRegisterDAO.verifyAdmin(email, password);
	}
}
