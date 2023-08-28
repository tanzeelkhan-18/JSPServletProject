<%@page import="com.jspServletExam.services.ProductServicesImpl"%>
<%@page import="com.jspServletExam.services.ProductServices"%>
<%@page import="com.jspServletExam.model.Products"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jspServletExam.dao.ProductsDAOImpl"%>
<%@page import="com.jspServletExam.dao.ProductsDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<br>
<h1 align="center">Products</h1>
<br>
<table align="center" border="2" width="90%" cellpadding="8px">
	<tr>
		<th>Product ID</th>
		<th>Product Name</th>
		<th>Price</th>
		<th>Vendor</th>
		<th>Quantity</th>
		<th>Warranty</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<%
	ProductServices ps = new ProductServicesImpl();
	ArrayList<Products> al = ps.findAllPb();
	%>
	<tr>
		<%
		for (Products p : al) {
		%>
		<td><%=p.getProductId()%></td>
		<td><%=p.getProductName()%></td>
		<td><%=p.getPrice()%></td>
		<td><%=p.getVendor()%></td>
		<td><%=p.getQuantity()%></td>
		<td><%=p.getWarranty()%></td>
		<td><a href="pEdit.jsp?productId=<%=p.getProductId()%>">Edit</a></td>
		<td><a href="pDelete.jsp?productId=<%=p.getProductId()%>">Delete</a></td>
	</tr>
	<%
	}
	%>
</table>

