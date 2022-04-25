<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers</title>
</head>
<body>
<form method="post" action="/Customers/details">

<label>Enter customer id : </label>
<input type="text" name="cid">
<label>Enter customer name : </label>
<input type="text" name = "cname">
<label>Enter customer mail : </label>
<input type="text" name = "cemail">
<input type="submit" value="Submit">
</form>

</body>
</html>