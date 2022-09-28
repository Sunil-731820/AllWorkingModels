<%@page import="com.java.jsp.EncrptionOfPinCode"%>
<%@page import="com.java.jsp.AddPassword"%>
<%@page import="com.java.jsp.AddPasswordDAO"%>
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
    </style>
</head>
<body>
<%
	AddPasswordDAO dao = new AddPasswordDAO();
	EncrptionOfPinCode erc1 = new EncrptionOfPinCode(); 

%>
<nav class="navbar navbar-expand-md navbar-light bg-light">
            <a href="#" class="navbar-brand"> 
            </a>
            <button type="button" class="navbar-toggler" data-toggle="collapse"
                    data-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarCollapse">
                <div class="navbar-nav ml-auto" style="margin-right: 30px;">
                    <a class="dropdown-item" href="HomePage.jsp">Home Page</a>
                </div>
            </div>
        </nav>
        <div>
            <h1>
                <b> Restore Privacy App </b>
            </h1>
        </div>
        <!-- Sing in  Form -->
        <form action="AddPassword.jsp" method="get">
            <section class="sign-in">
                <div class="container">
                    <div class="signin-content">
                        <div class="signin-image">
                            <figure><img src="img/addPassImg.jpg" alt="sing up image"></figure>
                            <a href="AddPassword.jsp">Reset Field Password </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                            <a href="ShowAllPassword.jsp">Restore PassWord If Forgot </a>
                            
                        </div>
                       
                        <div class="signin-form">
                            <h2 class="form-title">Add Safely</h2>
                              
                            <form method="get" class="register-form" id="login-form">
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h4></h4>
                                <div class="form-group">
                                    <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="number" name="normal" id="your_name" placeholder=" After Adding Password is Encrypted & Safe " />
                                </div>
                               
                                <div class="form-group">
                                    <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="AddPassword" id="your_name" placeholder=" Enter Password  " required="required"/>
                                </div>
                           
                                <div class="form-group form-button">
                                    <input type="submit" name="signin" id="signin" class="form-submit" value="Add"/>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </form>
        
        <%
        	if(request.getParameter("AddPassword")!=null || request.getParameter("normal")!=null){
        		AddPassword add = new AddPassword();
        		String AddPassword = request.getParameter("AddPassword");
            	String addP =  erc1.encrypt(AddPassword);
        		add.setAddPassword(addP);
        		dao.addPassWordSafely(add);
        		
        		 %>
            	 <jsp:forward page="PasswordAddedSuccessFully.jsp"/>
            	 
            	<% 
            }
            %>

</body>
</html>