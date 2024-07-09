<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="beans.car"  %>
 <jsp:useBean id ="c"  class="beans.car" scope="page"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
   c.setMakeYear(2014);
   c.setModel("Benz");
   c.setPrice(12.00);
%>

<%= c.getMakeYear()%>
<%= c.getModel() %>
<%= c.getPrice() %>

</body>
</html>