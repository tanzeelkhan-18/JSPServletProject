<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<div class="page-section">
	<div class="container">
		<h1 class="text-center wow fadeInUp">Login</h1>
		<form class="main-form" action="login" method="post"
			novalidate="novalidate">
			<div class="row mt-5 ">
				<div class="col-12 py-2 wow fadeInLeft">
					<input type="text" class="form-control" name="un"
						placeholder="User Name">
				</div>
				<div class="col-12 py-2 wow fadeInUp" data-wow-delay="300ms">
					<input type="password" class="form-control" name="ps"
						placeholder="Password">
				</div>
			</div>
			<button type="submit" class="btn btn-primary mt-3 wow zoomIn">Login</button>
			<br> <br> <a href="register.jsp">New Register</a> <br>
		</form>
	</div>
</div>