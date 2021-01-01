<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="../css/form.css" rel="stylesheet">

</head>
<body>
<body id="LoginForm">
<jsp:include page="home.jsp"></jsp:include>

<div>
<div>
<div class="container">
<h1 class="form-heading">Sign in Form</h1>
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Sign in</h2>
   <p>Please enter your email and password</p>
   </div>
    <sp:form id="Login" modelAttribute="user" action="${pageContext.request.contextPath}/user/signin" method="post">
    
    	<div class="form-group">


            <sp:input type="text" path="username" class="form-control" id="inputText" placeholder="Name"/>

        </div>
    

        <div class="form-group">


            <sp:input type="email" path="email" class="form-control" id="inputEmail" placeholder="Email Address"/>

        </div>
        
        <div class="form-group">


            <sp:input type="number" path="contact" class="form-control" id="inputNumber" placeholder="Phone number"/>

        </div>

        <div class="form-group">

            <sp:input type="password" path="password" class="form-control" id="inputPassword" placeholder="Password"/>

        </div>
        <div class="forgot">
        <a href="reset.html">Forgot password?</a>
</div>
	<div class="form-group">
        <a href="#"><input type="submit" class="btn btn-primary" value="Sign in"/></a>
    </div>
    <div class="form-group">
        <a href="${pageContext.request.contextPath}/user/login"><input type="button" class="btn btn-success" value="Login"/></a>
	</div>
    </sp:form>
    </div>
</div>
</div>
</div>

</div>
</body>
</html>