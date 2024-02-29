<%@page import="dto.Sample"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data Dispy</title>
<style>
div {
	width: 40%;
	height: 60%;
	border: 2px solid red;
	background-color: aqua;
	font-size: 20px;
	padding: 20px;
}
</style>
</head>
<body>
<%Sample sample=(Sample)request.getAttribute("data"); %>


	<div >

		<label>First Name </label><mark> <%=sample.getFirstName() %> </mark><br>
		<label>Last Name </label><mark> <%=sample.getLastName() %></mark><br>
		<h1>your course is</h1>
		<mark>
		<%=sample.getCourse() %>
		</mark>
	</div>
	

</body>
</html>