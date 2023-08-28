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
<title>Register</title>
<link rel="stylesheet" href="css/maicons.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="vendor/owl-carousel/css/owl.carousel.css">
<link rel="stylesheet" href="vendor/animate/animate.css">
<link rel="stylesheet" href="css/theme.css">
</head>
<body>
	<!-- Header -->
	<c:import url="header.jsp"></c:import>
	<!-- /Header -->
	<div class="page-section">
		<div class="container">
			<h1 class="text-center wow fadeInUp">Register</h1>

			<form class="main-form" name="sentMessage"
				action="registerControl.jsp" novalidate="novalidate">
				<div class="row mt-5 ">
					<div class="col-12 col-sm-6 py-2 wow fadeInLeft">
						<input type="text" class="form-control" name="name"
							placeholder="Name" required="required"
							data-validation-required-message="Please enter a Valid Name">
					</div>
					<div class="col-12 col-sm-6 py-2 wow fadeInLeft">
						<input type="text" class="form-control" name="contact"
							placeholder="Contact" required="required"
							data-validation-required-message="Please enter your ContactNumber">
					</div>
					<div class="col-12 col-sm-6 py-2 wow fadeInRight">
						<input type="text" class="form-control" name="email"
							placeholder="Email address" required="required"
							data-validation-required-message="Please enter your Email">
					</div>
					<div class="col-12 col-sm-6 py-2 wow fadeInLeft">
						<input type="text" class="form-control" name="username"
							placeholder="User Name" required="required"
							data-validation-required-message="Please enter a UserName">
					</div>
					<div class="col-12 py-2 wow fadeInUp" data-wow-delay="300ms">
						<input type="password" class="form-control" name="password"
							placeholder="Password" required="required"
							data-validation-required-message="Please set a valid Password">
					</div>
				</div>

				<button type="submit" class="btn btn-primary mt-3 wow zoomIn">Register</button>
			</form>
		</div>
	</div>

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