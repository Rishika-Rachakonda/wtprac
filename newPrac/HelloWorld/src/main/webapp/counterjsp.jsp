<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="beans.counter" %>
 <jsp:useBean id="c" class="beans.counter" scope="page" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="counterjsp.jsp" method="post">

<input  type="submit" name="increment" value="increment"/>
<input  type="submit" name="decrement" value="decrement"/>
</form> 
<%
int cnt =0;
  if(request.getParameter("increment")!=null){
	  c.inc();
	  cnt++;
  }
  else if(request.getParameter("decrement")!=null){
	  c.dec();
	  cnt--;
  }


%>

<%= c.val() %>
</body>
</html>