<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("uname");
out.println("The user Name is  "+ name);

session.setAttribute("uname", name);
%>
<a href="SecondSessionImplicitObject.jsp">Second Page</a>  
</body>
</html>