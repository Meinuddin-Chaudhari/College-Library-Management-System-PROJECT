package in.ineuron.library.to;

public class StudentRegisterTO {
	private int studentId;
	private String fullName;
	private String email;
	private String phone;
	private String dob;
	private String password;
	
	public StudentRegisterTO() {
		super();
	}

	public StudentRegisterTO(String fullName, String email, String phone, String dob, String password) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.password = password;
	}

	public StudentRegisterTO(int studentId, String fullName, String email, String phone, String dob, String password) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.password = password;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "StudentRegisterTO [studentId=" + studentId + ", fullName=" + fullName + ", email=" + email + ", phone="
				+ phone + ", dob=" + dob + ", password=" + password + "]";
	}
}
