<%@page import="com.java.jsp.Questions"%>
<%@page import="com.java.jsp.QuestionDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
        <link rel="stylesheet"
              href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script
        src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script
        src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link
            href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
            rel="stylesheet" id="bootstrap-css">
        <script
        src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script
        src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="css/register.css" type="text/css" />
         <style type="text/css">
        body {
            background-image: url("img/pass4.jpeg");
            background-color: #cccccc;
        }
        .img-rounded {
            height: 100%;
            width: 100%;
        }
        h1 {
            color: white;
            text-align: center;
        }
         .required:after {
    content:" *";
    color: red;
  }
    </style>
</head>
<body>


<nav class="navbar navbar-expand-md navbar-light bg-light">
            <a href="#" class="navbar-brand"> <img src="img/icons.jpg"
                                                   height="30" width="100" alt="Password">
            </a>
            <button type="button" class="navbar-toggler" data-toggle="collapse"
                    data-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarCollapse">
                <div class="navbar-nav ml-auto" style="margin-right: 30px;">
                    <a class="dropdown-item" href="AddPassword.jsp">AddPassword</a>    
                </div>
                
            </div>
        </nav> 
        <div>
            <h1>
                <b>Click To Get All Password If ForGot</b>
            </h1>
        </div>
   <form action="ShowAllPassword.jsp" method="get">
            <!-- Sign up form -->
            <section class="signup">
                <div class="container"> 
                    <div class="signup-content"> 
                        <div class="signup-form">
                            <h2 class="form-title"> </h2>
                            <form class="register-form" id="register-form">
                            	<div class="form-group">
                                    <label for="email" class="required"><i class="zmdi zmdi-email"></i></label>
                                    <input type="number"   name="id" placeholder="Enter the Id for the Resoring " required="required" />
                                </div>
                                 <div class="form-group form-button">
                                    <input type="submit" name="signup" id="signup" class="form-submit" value="Submit"/>
                                </div>
                            </form>
                        </div>
                        
                    </div>
                </div>
            </section>
        </form>
        
        
       
      
        
</body>
</html>