package in.ineuron.library.service;

import java.util.List;

import in.ineuron.library.dao.AdminEmailIdDAO;
import in.ineuron.library.dao.AdminRegisterDAO;
import in.ineuron.library.dao.DAOFactory;
import in.ineuron.library.to.AdminRegisterTO;

//admin service layer implementation
public class AdminEmailIdServiceImpl implements AdminEmailIdService {
	@Override
	public List getAllAdminEmailId() {
		// TODO Auto-generated method stub
		AdminEmailIdDAO adminEmailIdDAO=DAOFactory.getAdminEmailIdDAO();
		return adminEmailIdDAO.getAllAdminEmailId();
	}
}
