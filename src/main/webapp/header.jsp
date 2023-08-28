<%@page import="com.jspServletExam.model.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<header>
	<c:if test="${sessionScope.name!=null}">
		<h6 style='text-align: right' class='pr-5 mt-2 text-primary'>Welcome:
			${sessionScope.name}</h6>
	</c:if>
	<a class="navbar-brand ml-5" href="index.jsp">Product Management
		System</a>

	<nav class="navbar navbar-expand-lg navbar-light shadow-sm">
		<div class="container">
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupport" aria-controls="navbarSupport"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupport">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="aboutUs.jsp">About
							Us</a></li>
					<c:if test="${sessionScope.name==null}">
						<li class="nav-item"><a class="nav-link" href="contact.jsp">Contact</a>
						</li>
					</c:if>
					<c:if test="${sessionScope.name!=null}">
						<li class="nav-item"><a class="nav-link"
							href="addproduct.jsp">Add Product Details</a></li>
						<li class="nav-item"><a class="nav-link" href="index.jsp">Show
								Report</a></li>
						<li class="nav-item"><a class="nav-link" href="logout">Logout</a>
						</li>
					</c:if>
				</ul>
			</div>
		</div>
	</nav>
</header>
