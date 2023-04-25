package in.ineuron.library.to;

public class StudentEmailIdTO {
	private String emailId;

	public StudentEmailIdTO() {
		super();
	}

	public StudentEmailIdTO(String emailId) {
		super();
		this.emailId = emailId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "StudentEmailIdTO [emailId=" + emailId + "]";
	}
}
