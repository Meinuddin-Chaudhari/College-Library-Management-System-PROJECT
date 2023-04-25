package in.ineuron.library.service;

import java.util.List;
import in.ineuron.library.to.RequestedBookTO;
//requested book service layer
public interface RequestedBookService {
	public int addBookRequest(RequestedBookTO requestedBookTO);
	public int getBookRequestCounter(int studentId);
	public List<Integer> getRequestedBookIdList(int studentId);
	public int removeBookRequest(int bookId,int studentId);
	public List<RequestedBookTO> getAllBookRequest();
}
