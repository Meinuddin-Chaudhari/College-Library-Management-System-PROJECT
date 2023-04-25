package in.ineuron.library.dao;
import in.ineuron.library.to.AdminRegisterTO;

//librarian service requirement specification 
public interface AdminRegisterDAO {
	//Registering new librariain
	public int registerAdmin(AdminRegisterTO adminRegisterTO);
	//credential validation
	public AdminRegisterTO verifyAdmin(String email,String password);
}
