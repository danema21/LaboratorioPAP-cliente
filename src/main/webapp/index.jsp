<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Pagina Principal</title>
  </head>
  
  <style>
	body{
		background: url("img/webb-dark.png");
		background-repeat: repeat;
	}
	/*.container{
		width: 900px;
		position: absolute; 
		top: 80px;
	}*/
	.navbar{
		background: rgba(0, 0, 0, 0.6);
	}
	
	.d-block{
		width: auto;
		height: auto;
		max-height: 550px;
	}
	
	/*.contenedor-imagen{
		width: 100%;
		height: 550px;
		overflow: hidden;
		text-align: center;
	}
	
	.contenedor-imagen img{
		width: 100%;
	}
	#nav-item-crearUsuario, #nav-item-iniciarSesion{
		display: block; 
	}
	#carousel-container::after{
		content:""; 
		z-index: -1;
		width: 1200px; 
		height: 580px;
		// background: rgba(248, 248, 248, 0.5); 
		background: linear-gradient(to right, #0f2027, #203a43, #2c5364) !important;
		opacity: 0.7;
		// background: #5DC68A;
		position: absolute;
		top: -15px;
		left: -170px;
		border-radius: 30px;
	}
	#carousel-container::before{
		content:""; 
		z-index: -1;
		width: 100vw; 
		height: 600px;
		background: rgba(0, 0, 0, 0.6);
		position: absolute;
		top: -25px;
		left: -428px;
		// left: -20vw;
	}*/
	
  </style>
  <!-- PALETA DE COLORES
  botones -- #5DC68A
  navbar -- rgba(0, 0, 0, 0.6)
  fondo general -- background: url("img/webb-dark.png"); background-repeat: repeat;
  letras -- #F7F0F5
   -->
  
  <body>
	<%@include file="nav.jsp" %>


	<%//@include file="/sideBar2.jsp" %>
	<div class="container"
		id="carousel-container" style="right: 0; left: 0; margin-top: 70px">
		<div id="carouselExampleCaptions" class="carousel slide"
			data-bs-ride="carousel">
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="0" class="active" aria-current="true"
					aria-label="Slide 1"></button>
				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="1" aria-label="Slide 2"></button>
				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="2" aria-label="Slide 3"></button>
				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="3" aria-label="Slide 4"></button>
				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="4" aria-label="Slide 5"></button>
				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="5" aria-label="Slide 6"></button>
			</div>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<div class="contenedor-imagen">
						<img src="img/sars-cov.png" class="d-block w-100"
							alt="fallo imagen">
					</div>
					<div class="carousel-caption d-none d-md-block">
						<h5>Covid-19</h5>
						<p>Juntos lo vencemos, Quedate en casa, Nosotros ponemos el
							entretenimiento.</p>
					</div>
				</div>
				<div class="carousel-item">
					<div class="contenedor-imagen">
						<img src="img/evento1.jpg" class="d-block w-100"
							alt="fallo imagen">
					</div>
					<div class="carousel-caption d-none d-md-block">
						<h5>Conciertos en vivo</h5>
						<p>Ve tus conciertos favoritos, acá mismo! no te los pierdas.</p>
					</div>
				</div>
				<div class="carousel-item">
					<div class="contenedor-imagen">
						<img src="img/mkBand.jpg" class="d-block w-100" alt="fallo imagen">
					</div>
					<div class="carousel-caption d-none d-md-block"></div>
				</div>
				<div class="carousel-item">
					<div class="contenedor-imagen">
						<img src="img/evento2.jpg" class="d-block w-100"
							alt="fallo imagen">
					</div>
					<div class="carousel-caption d-none d-md-block">
						<h5>Registrate Ahora</h5>
						<p>Que esperas, es GRATIS!</p>
					</div>
				</div>
				<div class="carousel-item">
					<div class="contenedor-imagen">
						<img src="img/evento3.jpg" class="d-block w-100"
							alt="fallo imagen">
					</div>
					<div class="carousel-caption d-none d-md-block">
						<h5>Comparte la diversión</h5>
						<p>Diviertete con tus amigos y familia.</p>
					</div>
				</div>
				<div class="carousel-item">
					<div class="contenedor-imagen">
						<img src="img/evento4.jpg" class="d-block w-100"
							alt="fallo imagen">
					</div>
					<div class="carousel-caption d-none d-md-block">
						<h5>PROXIMAMENTE...</h5>
						<p>más de tus espectaculos favoritos.</p>
					</div>
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>
	</div>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
   </body>
</html>
