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
         
         .required:after {
    content:" *";
    color: red;
  }
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
	QuestionDAO dao = new QuestionDAO();
	int id = dao.generateQuestionsNo();
	int count = dao.counter();

%>
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
                    <a class="dropdown-item" href="HomePage.jsp">Home</a>    
                </div>
            </div>
        </nav> 
        <div>
            <h1>
                <b>Welcome To Restore Password Session</b>
            </h1>
        </div>
        <form action="AddQuestionForFutureRestorePassword.jsp" method="post">
            <!-- Sign up form -->
            <section class="signup">
                <div class="container"> 
                    <div class="signup-content"> 
                        <div class="signup-form">
                            <h2 class="form-title">Restore PassWord </h2>
                            <form class="register-form" id="register-form">
                            <div class="form-group">
                                    <label for="email" class="required"><i class="zmdi zmdi-email"></i></label>
                                    <input type="number" name="id" id="id" value=<%=id%> placeholder="Automatically Generated " required="required" />
                                </div>
                                <div class="form-group">
                                    <label for="email" class="required"><i class="zmdi zmdi-email"></i></label>
                                    <input type="text" name="nickName" id="email" placeholder="Enter Your Nick Name" required="required" />
                                </div>
                                <div class="form-group">
                                    <label for="pass" class="required"><i class="zmdi zmdi-lock"></i></label>
                                    <input type="text" name="schoolName" id="pass" placeholder="Enter School Name" required="required"/>
                                </div>
                                <div class="form-group">
                                    <label for="pass" class="required"><i class="zmdi zmdi-lock"></i></label>
                                    <input type="text" name="petName" id="pass" placeholder="Enter Pet Name" required="required"/>
                                </div>
                                <div class="form-group">
                                    <label for="pass" class="required"><i class="zmdi zmdi-lock"></i></label>
                                    <input type="text" name="favSports" id="pass" placeholder="Enter Your Favourite Sports" required="required"/>
                                </div>
                                <div class="form-group">
                                    <label for="pass" class="required"><i class="zmdi zmdi-lock"></i></label>
                                    <input type="text" name="favIdeal" id="pass" placeholder="Enter Your Favourite Ideal " required="required"/>
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
        
        <%
        	if(request.getParameter("id")!=null ){
        		Questions question = new Questions();
        		question.setId(id);
        		question.setNickName(request.getParameter("nickName"));
        		question.setSchoolName(request.getParameter("schoolName"));
        		question.setPetName(request.getParameter("petName"));
        		question.setFavSports(request.getParameter("favSports"));
        		question.setFavIdeal(request.getParameter("favIdeal"));
        		dao.AddQuestion(question);
        		
         %>
        		<jsp:forward page="AddPassword.jsp"/>
        		  		
        <% 		
        	}
        %>
        
        
      
</body>
</html>