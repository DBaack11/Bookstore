<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Orders</title>
<style>
table {
  border-collapse: collapse;
  width: 80%;
}
th, td {
  padding: 5px;
  border-collapse: collapse;
  border-bottom: 1px solid #ddd;
  background-color: #33CCFF;
  align: "center"";
}
th {
  text-align: left;
  background-color: #4CAF50;
  color: white;
}

a{
  text-decoration:none;
  }
  
tfoot {
 border-bottom: none;
}
tr:hover {background-color:#f5f5f5;}
</style>
</head>
<body>
<br />
<br />
<br />

<form method = "post" action = "navigationServlet">
<table align="center">
<tr>
	
    <th>Order ID</th>
    <th>Order date</th>
    <th>Book ISBN</th>
    <th>Book Title</th>
    <th>Student Id</th>
</tr>
<c:forEach items ="${requestScope.allOrders}" var="currentorders">
<tr>

 <td><b>${currentorders.orderId}</b></td>
 <td><b>${currentorders.orderDate}</b></td>
 <td><b>${currentorders.book.isbn}</b></td>
 <td><b>${currentorders.book.title}</b></td>
 <td><b>${currentorders.student.stId}</b></td>
 
 </tr>
 <tr>

</tr>
</c:forEach>


</table>

</form>
<br />
<br />
<center>
<a href="viewAllOrdersServlet">Veiw All The Orders</a><br />
<center><u>
<a href="index.html">Return To Home Page</a><br />
</u></center>
<a href = "viewAllBooksServlet">View All Books</a>
</center>
</body>
</html>