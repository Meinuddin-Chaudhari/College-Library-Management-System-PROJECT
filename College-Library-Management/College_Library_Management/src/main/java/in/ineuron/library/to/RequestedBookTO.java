package in.ineuron.library.to;

public class RequestedBookTO {
	private int bookId;
	private int studentId;
	
	public RequestedBookTO() {
		super();
	}

	public RequestedBookTO(int bookId, int studentId) {
		super();
		this.bookId = bookId;
		this.studentId = studentId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "RequestedBookTO [bookId=" + bookId + ", studentId=" + studentId + "]";
	}
}
