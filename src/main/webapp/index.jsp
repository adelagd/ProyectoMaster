<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NewUpStyle</title>


<link rel="stylesheet" href="./css/custom.css" />
<link rel="stylesheet" href="./css/bootstrap.min.css" />


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="./js/bootstrap.min.js"></script>


</head>
<body>

	<!--  MENU superior  -->

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">New Up Style</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Inicio</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Comprar<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Page 1-1</a></li>
						<li><a href="#">Page 1-2</a></li>
						<li><a href="#">Page 1-3</a></li>
					</ul>
				<li><a href="#">Vender</a></li>
			</ul>

			<form class="navbar-form navbar-left" action="/action_page.php">
				<div class="input-group">
					<input type="text" class="form-control" placeholder="Buscar">
					<div class="input-group-btn">
						<button class="btn btn-default" type="submit">
							<i class="glyphicon glyphicon-search"></i>
						</button>
					</div>
				</div>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="./pages/login.jsp"><span
						class="glyphicon glyphicon-user"></span> Tu cuenta</a></li>
				<li><a href="#"><span
						class="glyphicon glyphicon-shopping-cart"></span> Carrito</a></li>
			</ul>
		</div>
	</nav>



	<div class="container">
		<div class="header">
			<img src="./images/Logo.jpg" class="img-responsive"
				alt="Responsive image">
		</div>
		<br>
		<br>
		<div class="row">
			<div class="col-sm-3">
				<div class="panel panel-primary">
					<div class="panel-heading">BLACK FRIDAY DEAL</div>
					<div class="panel-body">
						<img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Buy 50 mobiles and get a gift card</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="panel panel-primary">
					<div class="panel-heading">BLACK FRIDAY DEAL</div>
					<div class="panel-body">
						<img src="https://placehold.it/350x150?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Buy 50 mobiles and get a gift card</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="panel panel-danger">
					<div class="panel-heading">BLACK FRIDAY DEAL</div>
					<div class="panel-body">
						<img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Buy 50 mobiles and get a gift card</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="panel panel-success">
					<div class="panel-heading">BLACK FRIDAY DEAL</div>
					<div class="panel-body">
						<img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Buy 50 mobiles and get a gift card</div>
				</div>
			</div>
		</div>
	</div>
	<br>

	<div class="container">
		<div class="row">
			<div class="col-sm-3">
				<div class="panel panel-primary">
					<div class="panel-heading">BLACK FRIDAY DEAL</div>
					<div class="panel-body">
						<img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Buy 50 mobiles and get a gift card</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="panel panel-primary">
					<div class="panel-heading">BLACK FRIDAY DEAL</div>
					<div class="panel-body">
						<img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Buy 50 mobiles and get a gift card</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="panel panel-primary">
					<div class="panel-heading">BLACK FRIDAY DEAL</div>
					<div class="panel-body">
						<img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Buy 50 mobiles and get a gift card</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="panel panel-primary">
					<div class="panel-heading">BLACK FRIDAY DEAL</div>
					<div class="panel-body">
						<img src="https://placehold.it/150x80?text=IMAGE"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Buy 50 mobiles and get a gift card</div>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>


</body>
</html>