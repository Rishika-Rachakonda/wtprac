<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate</title>
</head>
<body>
<%
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
String op = request.getParameter("op");
int res = 0;

if (op.equals("add")) {
    res = num1 + num2;
}
if (op.equals("mul")) {
    res = num1 * num2;
}

session.setAttribute("res", String.valueOf(res));
%>

<form id="redirectForm" action="calculator.jsp" method="post">
    <input type="hidden" name="result" value="<%= res %>">
</form>

<script type="text/javascript">
    document.getElementById('redirectForm').submit();
</script>

</body>
</html>