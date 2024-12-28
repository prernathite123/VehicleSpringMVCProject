
<%@page import="com.spring.Model.Vehicle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ShowById</title>
</head>
<body>
<h1>In single data jsp</h1>
<div style="background-color: blue">
<%
Vehicle v=(Vehicle)request.getAttribute("vehicle");
%>
<h1>Vehicle Details:<%=v
%></h1>

</div>
</body>
</html>