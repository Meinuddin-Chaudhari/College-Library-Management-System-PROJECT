package in.ineuron.library.to;

public class AdminEmailIdTO {
	private String emailId;

	public AdminEmailIdTO() {
		super();
	}

	public AdminEmailIdTO(String emailId) {
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
		return "AdminEmailIdTO [emailId=" + emailId + "]";
	}
}
