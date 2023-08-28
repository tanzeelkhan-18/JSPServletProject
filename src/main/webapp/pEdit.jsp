<%@page import="com.jspServletExam.model.Products"%>
<%@page import="com.jspServletExam.services.ProductServicesImpl"%>
<%@page import="com.jspServletExam.services.ProductServices"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="copyright" content="MACode ID, https://macodeid.com/">
<title>Update Product</title>
<link rel="stylesheet" href="css/maicons.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="vendor/owl-carousel/css/owl.carousel.css">
<link rel="stylesheet" href="vendor/animate/animate.css">
<link rel="stylesheet" href="css/theme.css">
</head>
<body>
	<%
	int productId = Integer.parseInt(request.getParameter("productId"));
	Products pb = new Products();
	ProductServices ps = new ProductServicesImpl();
	pb = ps.findbyPId(productId);
	%>

	<!-- Header -->
	<c:import url="header.jsp"></c:import>
	<!-- /Header -->

	<br>
	<h1 align='center'>Update Product</h1>
	<br>
	<form action="editProductControl.jsp" method="post">
		<table align='center' border='2' width='70%' cellpadding="8px">
			<tr>

				<th>Product Id :</th>

				<td><input type='text' name='productId'
					value="<%=pb.getProductId()%>" readonly></td>
			</tr>
			<tr>

				<th>Product Name :</th>

				<td><input type='text' name='name'
					value="<%=pb.getProductName()%>"></td>
			</tr>
			<tr>

				<th>Price :</th>

				<td><input type='text' name='price' value="<%=pb.getPrice()%>">
				</td>
			</tr>
			<tr>

				<th>Quantity in stock:</th>

				<td><select name="quantity">
						<option value=0>0</option>
						<option value=50>50</option>
						<option value=100>100</option>
						<option value=150>150</option>
						<option value=200>200</option>
				</select></td>
			</tr>
			<tr>

				<th>Vendor :</th>

				<td><input type='text' name='vendor'
					value="<%=pb.getVendor()%>"></td>
			</tr>
			<tr>

				<th>Warranty :</th>

				<td><select name="warranty">
						<option value=0>0</option>
						<option value=1>1</option>
						<option value=2>2</option>
						<option value=3>3</option>
						<option value=4>4</option>
						<option value=5>5</option>
						<option value=6>6</option>
						<option value=7>7</option>
						<option value=8>8</option>
						<option value=9>9</option>
						<option value=10>10</option>
				</select></td>
			</tr>
			<tr>

				<th></th>

				<td><input type='submit' value='Update Product'>
			</tr>
		</table>
	</form>
	<br>

	<!-- Footer -->
	<c:import url="footer.jsp"></c:import>
	<!-- /Footer -->

	<script src="js/jquery-3.5.1.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="vendor/owl-carousel/js/owl.carousel.min.js"></script>
	<script src="vendor/wow/wow.min.js"></script>
	<script src="js/theme.js"></script>
</body>
</html>