import java.time.LocalDate;
import java.util.List;
import controller.LocalDateAttributeConverter;
import controller.OrderHelper;
import controller.StudentHelper;
import controller.BookHelper;
import model.Book;
import model.Order;
import model.Student;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 6, 2021
 */
public class StartProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b = new Book();
		b.setIsbn( 1111000 );
		BookHelper bh = new BookHelper();
		bh.updateBook(b);
		bh.insertBook(b);
		List<Book> allBooks = bh.showAllBooks();
		for(Book bs: allBooks) {
			System.out.println(bs.toString());
		}
		
		

		
	}
	

}
