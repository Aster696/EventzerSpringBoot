<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="../css/form.css" rel="stylesheet">

</head>
<body id="LoginForm">
<jsp:include page="home.jsp"></jsp:include>

<div>
<div>
<div class="container">
<h1 class="form-heading">Login Form</h1>
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Login</h2>
   <p>Please enter your email and password</p>
   </div>
    <form id="Login" action="<sp:url value='/loginaction'></sp:url>" method="post">

        <div class="form-group">


            <input type="email" name="username" class="form-control" id="inputEmail" placeholder="Email Address">

        </div>

        <div class="form-group">

            <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Password">

        </div>
        <div class="forgot">
        <a href="reset.html">Forgot password?</a>
</div>
    <div class="form-group">
        <a href="#"><input type="submit" class="btn btn-primary" value="login"/></a>
    </div>
    <div class="form-group">
        <a href="${pageContext.request.contextPath}/user/signin"><input type="button" class="btn btn-success" value="Sign in"/></a>
	</div>
    </form>
    </div>
</div>
</div>
</div>

</div>

</body>
</html>