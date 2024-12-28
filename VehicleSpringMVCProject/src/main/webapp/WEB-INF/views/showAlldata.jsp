<%@page import="com.spring.Model.Vehicle"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hii</h1>
<%
    List<Vehicle> list = (List<Vehicle>) request.getAttribute("vehicleshow");
    if (list != null && !list.isEmpty()) {
        for (Vehicle vehicle : list) {
            out.println(vehicle.toString()); // Or display specific fields
        }
    } else {
        out.println("No vehicles available.");
    }
%>


</body>

</html>
