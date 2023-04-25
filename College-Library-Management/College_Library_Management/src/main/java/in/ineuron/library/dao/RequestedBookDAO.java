package in.ineuron.library.dao;

import java.util.List;
import in.ineuron.library.to.RequestedBookTO;
//Student requested book service requirement specification
public interface RequestedBookDAO {
	public int addBookRequest(RequestedBookTO requestedBookTO);
	public int getBookRequestCounter(int studentId);
	public List<Integer> getRequestedBookIdList(int studentId);
	public int removeBookRequest(int bookId,int studentId);
	public List<RequestedBookTO> getAllBookRequest();
}
