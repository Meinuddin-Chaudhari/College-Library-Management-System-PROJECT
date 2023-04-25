package in.ineuron.library.to;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IssuedBookTO {
	private int studentId;
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookCategory;
	private Date borrowedDate;
	private int fineAmount;
	
	public IssuedBookTO() {
		super();
	}

	public IssuedBookTO(int studentId, int bookId, String bookTitle, String bookAuthor, String bookCategory,
			Date borrowedDate, int fineAmount) {
		super();
		this.studentId = studentId;
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookCategory = bookCategory;
		this.borrowedDate = borrowedDate;
		this.fineAmount = fineAmount;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public Date getBorrowedDate() {
		return borrowedDate;
	}
	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}
	public int getFineAmount() {
		return fineAmount;
	}
	public void setFineAmount(int fineAmount) {
		this.fineAmount = fineAmount;
	}

	@Override
	public String toString() {
		return "IssuedBookTO [studentId=" + studentId + ", bookId=" + bookId + ", bookTitle=" + bookTitle
				+ ", bookAuthor=" + bookAuthor + ", bookCategory=" + bookCategory + ", borrowedDate=" + borrowedDate
				+ ", fineAmount=" + fineAmount + "]";
	}
}
