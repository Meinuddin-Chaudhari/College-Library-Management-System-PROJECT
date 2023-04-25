package in.ineuron.library.to;

public class AdminRegisterTO {
	private int adminId;
	private String fullName;
	private String email;
	private String password;
	
	public AdminRegisterTO() {
		super();
	}

	public AdminRegisterTO(String fullName, String email, String password) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}

	public AdminRegisterTO(int adminId, String fullName, String email, String password) {
		super();
		this.adminId = adminId;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminRegisterTO [adminId=" + adminId + ", fullName=" + fullName + ", email=" + email + ", password="
				+ password + "]";
	}
}
