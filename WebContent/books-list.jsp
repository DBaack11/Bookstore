<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Books</title>
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
	
    <th>Book ISBN </th>
    <th>Book Title</th>
    <th>Category</th>
    <th>Pub Date</th>
    <th>Book Cost</th>
</tr>
<c:forEach items ="${requestScope.allBooks}" var="currentbooks">
<tr>

 <td>${currentbooks.isbn}</td>
 <td>${currentbooks.title}</td>
 <td>${currentbooks.category}</td>
 <td>${currentbooks.pubDate}</td>
 <td>${currentbooks.cost}</td>
 
 </tr>
 <tr>

</tr>
</c:forEach>


</table>

</form>

<br/>
<br/>
<center><u>
<a href="index.html">Return To Home Page</a><br />
</u></center>

</body>
</html>