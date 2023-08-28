<%@page import="com.jspServletExam.model.Users"%>
<%@page import="com.jspServletExam.services.UserServicesImpl"%>
<%@page import="com.jspServletExam.services.UserServices"%>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<%
	UserServices us = new UserServicesImpl();
	String name = request.getParameter("name");
	String contact = request.getParameter("contact");
	String email = request.getParameter("email");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	us.addUser(name, contact, email, username, password);
	%>
	<c:redirect url="index.jsp" />
</body>
</html>