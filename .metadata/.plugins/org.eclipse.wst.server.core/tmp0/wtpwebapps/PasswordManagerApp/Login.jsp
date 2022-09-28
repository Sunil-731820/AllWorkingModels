<%@page import="com.java.jsp.EncrptionOfPinCode"%>
<%@page import="com.java.jsp.DecryptionOfPinCode"%>
<%@page import="com.java.jsp.LoginDAOPinCode"%>
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
	DecryptionOfPinCode dec = new DecryptionOfPinCode();
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
                    <a class="dropdown-item" href="Register.jsp">Sign Up</a>
                </div>
            </div>
        </nav>
        <div>
            <h1>
                <b>Welcome To Restore Privacy App </b>
            </h1>
        </div>
        <!-- Sing in  Form -->
        <form action="Login.jsp" method="get">
            <section class="sign-in">
                <div class="container">
                    <div class="signin-content">
                        <div class="signin-image">
                            <figure><img src="img/signin-image.jpg" alt="sing up image"></figure>
                            <a href="Register.jsp" class="signup-image-link">Create an account</a>
                        </div>

                        <div class="signin-form">
                            <h2 class="form-title">Sign in</h2>
                            <form method="get" class="register-form" id="login-form">
                                <div class="form-group">
                                    <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="userName" id="your_name" placeholder=" Enter User Name" required="required"/>
                                </div>
                                
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h4></h4>
                                <div class="form-group">
                                    <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="number" name="pinCode" id="your_name" placeholder=" Enter Pass Code " required="required"/>
                                </div>
                           
                                <div class="form-group form-button">
                                    <input type="submit" name="signin" id="signin" class="form-submit" value="Log In"/>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </form>
        
        <%
        	if(request.getParameter("userName")!=null && request.getParameter("pinCode")!=null){
        		String userName = request.getParameter("userName").trim();
        		String pinCode = EncrptionOfPinCode.encrypt(request.getParameter("pinCode").trim());
        		out.println(pinCode);
        		LoginDAOPinCode dao = new LoginDAOPinCode();
        		int count = dao.loginUsingPinCode(userName , pinCode);
        		if(count==1){
         %>
        	<jsp:forward page="AddQuestionForFutureRestorePassword.jsp"/>
        				<% 
        	       }
        	       else{
        	        %>	
        	        <jsp:forward page="LoginError.jsp"/>
        	        <% 
        	      }
        	        %>
        	        		
        	<%
        	        	
        	}
        %>	
       
</body>
</html>