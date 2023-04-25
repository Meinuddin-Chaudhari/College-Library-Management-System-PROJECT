package in.ineuron.library.service;
import in.ineuron.library.to.AdminRegisterTO;

//admin service layer
public interface AdminRegisterService {
	public int registerAdmin(AdminRegisterTO adminRegisterTO);
	public AdminRegisterTO verifyAdmin(String username,String password);
}
