<%@page import="com.jspServletExam.services.ProductServicesImpl"%>
<%@page import="com.jspServletExam.services.ProductServices"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<%
	int productId = Integer.parseInt(request.getParameter("productId"));
	ProductServices ps = new ProductServicesImpl();
	ps.deletePro(productId);
	response.sendRedirect("index.jsp");
	%>
</body>
</html>