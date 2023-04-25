package in.ineuron.library.Listeners;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

import in.ineuron.library.Servlets.IneuronBase;
import in.ineuron.library.to.BookTO;
import in.ineuron.library.to.IssuedBookTO;

@WebListener
public class MySessionListener extends IneuronBase implements HttpSessionListener {

	static {
		System.out.println("MySessionListener-S.B");
	}
	
	public  MySessionListener() {
		System.out.println("MySessionListener-D.C");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("MySessionListener-sessionCreated");
		HttpSession session=event.getSession();
		
		List<BookTO> myList=bookService.getAllBooks();
		session.getServletContext().setAttribute("BOOKLIST", myList);
		
		List<IssuedBookTO> issuedBookList=issuedBookService.getAllIssuedBook();
		session.getServletContext().setAttribute("ISSUEDBOOKLISTWITHFINE", issuedBookList);
		
		long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis); 
		String currentDate=date.toString();
		
		if(!issuedBookList.isEmpty()) {
			for(IssuedBookTO issuedBookDetails:issuedBookList) {
				
				int studentId=issuedBookDetails.getStudentId();
				int bookId=issuedBookDetails.getBookId();
				String borrowedDate=issuedBookDetails.getBorrowedDate().toString();
					
				//Parsing the date
				LocalDate dateBefore = LocalDate.parse(borrowedDate);
				LocalDate dateAfter = LocalDate.parse(currentDate);
					
				//calculating number of days between today's date and borrowed date
				int noOfDaysBetween =(int) ChronoUnit.DAYS.between(dateBefore,dateAfter);
				if(noOfDaysBetween>15) {
					//Calculating fine amount 
					int fineAmount=(noOfDaysBetween-15)*10;
					issuedBookService.addBorrowedBookFine(fineAmount, studentId, bookId);
					
					List<IssuedBookTO> issuedBookList2=issuedBookService.getAllIssuedBook();
					session.getServletContext().setAttribute("ISSUEDBOOKLISTWITHFINE", issuedBookList2);
				}
			}
			
		}
	}
	
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("MySessionListener-sessionDestroyed");
	}

}
