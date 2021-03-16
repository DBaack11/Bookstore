package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Book;

/**
 * Servlet implementation class EditBookServlet
 */
@WebServlet("/editBookServlet")
public class EditBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditBookServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		BookHelper bh = new BookHelper();
		
		String id = request.getParameter("id");
		String isbn = request.getParameter("isbn");
		String title = request.getParameter("title");
		String cat = request.getParameter("category");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String cost = request.getParameter("cost");
		LocalDate ld;
		try {
			ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		} catch (NumberFormatException ex) {
			ld = LocalDate.now();
		}
		
		
		Integer tempId = Integer.parseInt(request.getParameter(id));
		Book bookToUpdate = bh.searchForBookById(tempId);
		
		bookToUpdate.setIsbn(Integer.parseInt(isbn));
		bookToUpdate.setTitle(title);
		bookToUpdate.setCategory(cat);
		bookToUpdate.setPubDate(ld);
		bookToUpdate.setCost(Integer.parseInt(cost));
		
		bh.updateBook(bookToUpdate);
		try {
		getServletContext().getRequestDispatcher("/viewAllBooksServlet").forward(request, response);
		} catch (NumberFormatException e) {
			System.out.println("Forgot to select an item");
			}

	}

}
