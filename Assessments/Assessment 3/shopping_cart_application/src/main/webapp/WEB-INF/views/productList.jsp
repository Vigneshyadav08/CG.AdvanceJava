<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Products<br>
-----------</h2>
<form action = "addToCart" method = "post" onsubmit="func()">
Laptop - Rs.70000/- - 
<input type = "number" name="laptopQty"/><br><br>
Mobile - Rs.40000/-
<input type = "number" name = "mobileQty"/><br><br>
Head Phone - Rs.1500/-
<input type = "number" name = "headPhoneQty"/><br><br>
<input type = "submit" value = "Add To Cart"/>
<input type = "reset" value = "Reset the Cart"/>
</form>

<script>
function func()
{
	alert("Added to Cart");
}
</script>

</body>
</html>