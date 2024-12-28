<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red;background-color: blue" > Update Vehicle Form</h1>

<center>
<div>

<form action="update">
<label>Vehicle Id:</label>
<input type="number" name="vid" placeholder="Enter Vehicle id">
<br><br>
<label>Vehicle Name:</label>
<input type="text" name="vname" placeholder="Enter Vehicle name">
<br><br>
<label>Vehicle Price:</label>
<input type="number" name="price" placeholder="Enter Vehicle Price">
<br><br>
<label>Vehicle Milage:</label>
<input type="text" name="milage" placeholder="Enter Vehicle Milage">
<br><br>
<button type="submit" >Update</button>

</form>
</div>
</center>
</body>
</html>