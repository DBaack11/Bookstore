<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Book</title>
<style>

table {
  background-color: #33CCFF;
  border-collapse: collapse;
  width: 80%;
}
th, td {
  padding: 5px;
  border-collapse: collapse;
  }
  th {
  background-color: #4CAF50;
  color: white;
  }
</style>
</head>
<body>
<br />
<br />
<br />
<form action = "editBookServlet" method="post">
<table align="center">
<tr>
	<th colspan="2">Update Book Information</th>
</tr>



<tr>
<td><input type = "hidden" name = "id" value="${bookToUpdate.id}"></td>
</tr>
<tr>
<td align="right">ISBN: </td> 
<td><input type ="text" name = "isbn" value="${bookToUpdate.isbn}"></td>
</tr>
<tr>
<td align="right">Title: </td>
<td><input type = "text" name = "title" value= "${bookToUpdate.title}"></td>
</tr>

<tr>
<td align="right">Category: </td>
<td><input type = "text" name = "category" value= "${bookToUpdate.category}"></td>
</tr>

<tr>
<td align="right">Pub Date: </td>
<td><input type="text" name="year" placeholder="YYYY" size="4" value="${year}"></td>
<td><input type="text" name="day" placeholder="MM" size="4" value="${month}"></td> 
<td><input type="text" name="year"placeholder="DD" size="4" value="${day}"></td>
<td></td>
</tr>
<tr>
<td align="right">Cost: </td>
<td><input type = "text" name = "cost" value= "${bookToUpdate.cost}"></td>
</tr>

<tr>
<td><input type = "submit" value="Save Edited Item"></td>
</tr>
</table>
</form>

</body>
</html>