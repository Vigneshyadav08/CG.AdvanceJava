<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Cart Details<br>
-------------------------------------------</h2>
<p><b>Product Name:</b> Laptop<br>
<b>Price:</b> Rs.70000/-<br>
<b>Quantity:</b> ${cart.laptopQty}</p>
<br>

<p><b>Product Name:</b> Mobile<br>
<b>Price:</b> Rs.40000/-<br>
<b>Quantity:</b> ${cart.mobileQty}</p>
<br>

<p><b>Product Name:</b> Head Phones<br>
<b>Price:</b> Rs.1500/-<br>
<b>Quantity</b> - ${cart.headPhoneQty}</p><br>
-----------------------------------------------------------<br>
<b>Total</b>: ${laptopTotal} + ${mobileTotal} + ${headPhoneTotal}<br><br>
<b>Total Amount to be Paid: </b> Rs. ${totalAmount} /- 

<form onsubmit="funce()">
<input type = "submit" value = "Place Order" />
</form>

<script>
function funce()
{
	alert("Order Placed Successfully");}
</script>
</body>
</html>