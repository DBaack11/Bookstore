package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;
import model.Order;
import model.Student;

/**
 * Servlet implementation class AddNewOrderServlet
 */
@WebServlet("/addNewOrderServlet")
public class AddNewOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookHelper bh = new BookHelper();
		OrderHelper oh = new OrderHelper();
		String orderID = request.getParameter("orderID");
		String isbn = request.getParameter("isbn");
		String cat = request.getParameter("category");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");
		String bookTitle = request.getParameter("bookTitle");
		String studentID = request.getParameter("studentID");
		LocalDate ld;
		
		Book tempBook = new Book();
		tempBook.setTitle(bookTitle);
		
		Student tempStudent = new Student();
		tempStudent.setStId(studentID);
		
		try {
			ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		} catch (NumberFormatException ex) {
			ld = LocalDate.now();
		}
		
		Order o = new Order(Integer.parseInt(orderID), ld, tempBook, tempStudent);
		oh.insertOrder(o);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
