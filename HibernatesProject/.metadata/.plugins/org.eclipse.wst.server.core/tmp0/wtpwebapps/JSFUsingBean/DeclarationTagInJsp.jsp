<%@page import="java.io.PrintWriter"%>
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
	PrintWriter out1 = response.getWriter();
%>
<%! int data = 100; %>
<% out1.println("The Data is  "+data); %>

<%!
int cube(int Number){
	return Number*Number*Number;
}
%>

<%
out1.print("The Cube of the number is " + cube(3));
%>
</body>
</html>