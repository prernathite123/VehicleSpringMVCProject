<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert New Vehicle</title>
</head>
<body>
<h1 style="color:red;background-color: blue" >Vehicle Form</h1>

<center>
<div>

<form action="add">

<label>Vehicle Name:</label>
<input type="text" name="vname" placeholder="Enter Vehicle name">
<br><br>
<label>Vehicle Price:</label>
<input type="number" name="price" placeholder="Enter Vehicle Price">
<br><br>
<label>Vehicle Milage:</label>
<input type="text" name="milage" placeholder="Enter Vehicle Milage">
<br><br>
<button type="submit" >Add</button>

</form>
</div>
</center>
</body>
</html>