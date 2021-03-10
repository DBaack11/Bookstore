import java.time.LocalDate;
import java.util.List;
import controller.LocalDateAttributeConverte;
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

		Student st = new Student(9999);
		Book bk = new Book(19822,"Web", "Web Dev", LocalDate.now(),56);
		
		Order or = new Order(bk,st);
		OrderHelper oh = new OrderHelper();
		oh.setOrder(or);
		List<Order> allOrders = oh.showAllOrders();
		for(Order os: allOrders) {
			System.out.println(os.toString());
		}
		

		
	}
	

}
