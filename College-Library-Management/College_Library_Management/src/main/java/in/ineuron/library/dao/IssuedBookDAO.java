package in.ineuron.library.dao;
import java.util.List;
import in.ineuron.library.to.IssuedBookTO;

//this is book providing service requirement specification
public interface IssuedBookDAO {
	public int addIssuedBook(IssuedBookTO issuedBookTO);
	public List<IssuedBookTO> getAllIssuedBook();
	public int deleteIssuedBook(int studentId,int bookId);
	public int addBorrowedBookFine(int fineAmount,int studentId,int bookId);
	public int getBorrowedBookCounter(int studentId);
}
