<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	<th>ISBN </th>
    <th>Book ISBN </th>
    <th>Book Title</th>
    <th>Category</th>
    <th>Pub Date</th>
    <th>Book Cost</th>
</tr>
<c:forEach items ="${requestScope.allBooks}" var="currentbooks">
<tr>
 <td><input type="radio" name="id" value="${currentbooks.isbn}"></td>
 <td><b>${currentbooks.isbn}</b></td>
 <td><b>${currentbooks.title}</b></td>
 <td><b>${currentbooks.category}</b></td>
 <td><b>${currentbooks.pubDate}</b></td>
 <td><b>${currentbooks.cost}</b></td>
 </tr>
 <tr>

</tr>
</c:forEach>
<tfoot>
 <tr bgcolor ="#f5f5f5">
 <td></td>
  <td style="text-align:center;"><input type = "submit" value = "edit" name="doThis"></td>
  <td></td>
  <td style="text-align:center;"><input type = "submit" value = "delete" name="doThis"></td>
  <td></td>
  <td style="text-align:center;"><input type="submit" value = "add" name = "doThis"></td>
 </tr>
</tfoot>

</table>

</form>
<br />
<br />
<center>
<a href="viewAllOrdersServlet">Veiw All The Orders</a><br />
</center>
</body>
</html>