<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.trisquaree" %>
<jsp:useBean id="ar"  class="beans.trisquaree" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
    int area = ar.areaRec(1, 2);
%>

The area of the rectangle is: <%= area %>


</body>
</html>