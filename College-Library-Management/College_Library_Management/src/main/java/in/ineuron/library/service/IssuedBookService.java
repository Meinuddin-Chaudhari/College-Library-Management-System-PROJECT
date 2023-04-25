package in.ineuron.library.service;

import java.util.List;

import in.ineuron.library.to.IssuedBookTO;
//Issued Book service layer
public interface IssuedBookService {
	public int addIssuedBook(IssuedBookTO issuedBookTO);
	public List<IssuedBookTO> getAllIssuedBook();
	public int deleteIssuedBook(int studentId,int bookId);
	public int addBorrowedBookFine(int fineAmount,int studentId,int bookId);
	public int getBorrowedBookCounter(int studentId);
}
