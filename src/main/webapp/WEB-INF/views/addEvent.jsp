<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="../css/form.css" rel="stylesheet">

</head>
<body>
<jsp:include page="home.jsp"></jsp:include>

<div>

<div>
<div class="container">
<h1 class="form-heading">Add Event</h1>
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Add Event</h2>
   <p>Please enter your event Details</p>
   </div>
    <sp:form id="Login" modelAttribute="event" action="${pageContext.request.contextPath}/event/addEvent">

        <div class="form-group">

			<label>Name</label>
            <sp:input type="text" path="eventName" name="eventName" class="form-control" id="inputText" placeholder="Event Name"/>

        </div>

        <div class="form-group">
			<label>Select Category</label>
            <sp:select path="category" class="form-control">
            	<sp:option value="Dance">Dance</sp:option>
            	<sp:option value="Music">Music</sp:option>
            	<sp:option value="Video">Video</sp:option>
            </sp:select>
            
        </div>
        
        <div class="form-group">

			<label>Description</label>
            <sp:textarea path="description" placeholder="Event Description" class="form-control"></sp:textarea>
            
        </div>
        
        <div class="form-group">

			<label>Image</label>
            <sp:input type="text" path="images" name="images" class="form-control" id="inputText" placeholder="Enter link of the image"/>

        </div>
        
        <div class="form-group">

			<label>Event Date</label>
            <sp:input type="date" path="date" name="date" class="form-control" id="inputText" placeholder="Event Start Time"/>

        </div>
        
        <div class="form-group">

			<label>Event Start Time</label>
            <sp:input type="time" path="timeIn" name="timeIn" class="form-control" id="inputText" placeholder="Event Start Time"/>

        </div>
        
        <div class="form-group">

			<label>Event End Time</label>
            <sp:input type="time" path="timeOut" name="timeOut" class="form-control" id="inputText" placeholder="Event End Time"/>

        </div>
        
        <div class="forgot">
        	<a href="reset.html">Forgot password?</a>
		</div>
    <div class="form-group">
        <a href="#"><input type="submit" class="btn btn-primary" value="Add +"/></a>
    </div>
    <div class="form-group">
        <a href="#"><input type="reset" class="btn btn-danger" value="Reset"/></a>
	</div>
    </sp:form>
    </div>
</div>
</div>
</div>

</div>


</body>
</html>