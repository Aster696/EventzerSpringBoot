<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>

<link href="/css/home.css" rel="stylesheet">
<script src="/js/home.js"></script>

</head>
<body>
<div>

<div id="flipkart-navbar">
    <div class="container">
       
        <div class="row row2">
            <div class="col-sm-2">
                <span class="smallnav menu" onclick="openNav()"><i class="fa fa-bars" aria-hidden="true"></i> Brand</span>
                <h1 style="margin:0px;"><span class="largenav">Eventzer</span></h1>
            </div>
            <div class="flipkart-navbar-search smallsearch col-sm-8 col-xs-11">
                <div class="row">
                    <input class="flipkart-navbar-input col-xs-11" type="search" placeholder="Search for Products, Brands and more" name="search"/>
                    <button class="flipkart-navbar-button col-xs-1">
                        <i class="fa fa-search"></i>
                    </button>
                </div>
            </div>
            <div class="cart largenav col-sm-2">
                <a class="cart-button" href="${pageContext.request.contextPath}/manage/myEvent">
                    <svg class="cart-svg " width="16 " height="16 " viewBox="0 0 16 16 ">
                        <path d="M15.32 2.405H4.887C3 2.405 2.46.805 2.46.805L2.257.21C2.208.085 2.083 0 1.946 0H.336C.1 0-.064.24.024.46l.644 1.945L3.11 9.767c.047.137.175.23.32.23h8.418l-.493 1.958H3.768l.002.003c-.017 0-.033-.003-.05-.003-1.06 0-1.92.86-1.92 1.92s.86 1.92 1.92 1.92c.99 0 1.805-.75 1.91-1.712l5.55.076c.12.922.91 1.636 1.867 1.636 1.04 0 1.885-.844 1.885-1.885 0-.866-.584-1.593-1.38-1.814l2.423-8.832c.12-.433-.206-.86-.655-.86 " fill="#fff "></path>
                    </svg>My Events
                    <span class="item-number ">0</span>
                </a>
            </div>
        </div>
        
         <div class="row row1">
            <ul class="largenav pull-right">
            	<li class="upper-links"><a class="links" href="${pageContext.request.contextPath}/home">Home</a></li>
            	<li class="upper-links"><a class="links" href="${pageContext.request.contextPath}/event/displayEvents">Events</a></li>
            <sec:authorize access="!isAuthenticated()">
                <li class="upper-links"><a class="links" href="${pageContext.request.contextPath}/user/signin">Sign in</a></li>
                <li class="upper-links"><a class="links" href="${pageContext.request.contextPath}/user/login">Log in</a></li>
            </sec:authorize>   
            <sec:authorize access="isAuthenticated()">
            	<li class="upper-links"><a class="links" href="${pageContext.request.contextPath}/event/addEvent">Add Event</a></li>
            </sec:authorize>
                <li class="upper-links">
                    <a class="links" href="${pageContext.request.contextPath}/manage/subEvent">
                        <svg class="" width="16px" height="12px" style="overflow: visible;">
                            <path d="M8.037 17.546c1.487 0 2.417-.93 2.417-2.417H5.62c0 1.486.93 2.415 2.417 2.415m5.315-6.463v-2.97h-.005c-.044-3.266-1.67-5.46-4.337-5.98v-.81C9.01.622 8.436.05 7.735.05 7.033.05 6.46.624 6.46 1.325v.808c-2.667.52-4.294 2.716-4.338 5.98h-.005v2.972l-1.843 1.42v1.376h14.92v-1.375l-1.842-1.42z" fill="#fff"></path>
                        </svg>
                    </a>
                </li>
                <sec:authorize access="isAuthenticated()">
                <li class="upper-links dropdown"><a href="#"><sec:authentication property="principal.username"/></a>
                    <ul class="dropdown-menu">
                        <li class="profile-li"><a class="profile-links" href="${pageContext.request.contextPath}/event/addEvent">Add Event</a></li>
                        
                        <li class="profile-li"><a class="profile-links" href="${pageContext.request.contextPath}/logout">Log out</a></li>
                    </ul>
                </li>
                <li class="upper-links"><a class="links" href="${pageContext.request.contextPath}/logout">Log out</a></li>
                </sec:authorize>
            </ul>
        </div>
        
    </div>
</div>
<div id="mySidenav" class="sidenav">
    <div class="container" style="background-color: #2874f0; padding-top: 10px;">
        <span class="sidenav-heading">Home</span>
        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
    </div>
    <a href="#">Link</a>
    <a href="#">Link</a>
    <a href="#">Link</a>
    <a href="#">Link</a>
</div>

</div>

</body>
</html>