<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<h3>Calculator</h3>
<form action="calculate.jsp" method="post">
    <input type="number" id="num1" name="num1" required><br><br>
    <input type="number" id="num2" name="num2" required><br><br>
    <input type="radio" id="add" name="op" value="add">Add
    <input type="radio" id="mul" name="op" value="mul">Mul
    <input type="submit" value="Calculate">
</form>

<%
String res = (String) session.getAttribute("res");
if (res != null) {
%>
<h3>Result: <%= res %></h3>
<%
}
%>
</body>
</html>