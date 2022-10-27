<%@page import="com.java.jsf.Calculator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="calculator" class="com.java.jsf.Calculator"/>
<%
int res = Calculator.Cube(5);
out.println("The Cube Of The Number is "+ res);

%>
</body>
</html>