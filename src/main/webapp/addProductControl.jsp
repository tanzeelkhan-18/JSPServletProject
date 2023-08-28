<%@page import="com.jspServletExam.services.ProductServicesImpl"%>
<%@page import="com.jspServletExam.services.ProductServices"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Product</title>
</head>
<body>
	<%
	ProductServices ps = new ProductServicesImpl();
	String productName = request.getParameter("name");
	double price = Double.parseDouble(request.getParameter("price"));
	int quantity = Integer.parseInt(request.getParameter("quantity"));
	String vendor = request.getParameter("vendor");
	int warranty = Integer.parseInt(request.getParameter("warranty"));
	ps.addPro(productName, price, quantity, vendor, warranty);
	%>
	<c:redirect url="index.jsp" />

</body>
</html>