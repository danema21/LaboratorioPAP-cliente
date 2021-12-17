<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Seleccionar Plataforma.</title>
</head>
<style>
body {
	background: url("img/webb-dark.png");
	background-repeat: repeat;
}

.textoLabel {
	color: #F7F0F5;
}

.container {
	margin: 0 auto;
	margin-top: 120px;
	background: rgba(0, 0, 0, 0.6);
	border-radius: 15px;
}
</style>
<body>
	<%
		String mostrar = (String) request.getAttribute("mostrar");
		String plataformas[]=null;//List<String> plataformas = null;
		String espectaculos[]=null;
		if (mostrar!=null && mostrar.equals("plataformas")){
			plataformas= (String[])request.getAttribute("plataformas");
		}
		%>

	<%@include file="nav.jsp"%>

	<div class="container md-w-75 p-3">
		<div class="row mb-4 d-flex justify-content-between">
			<div class="col-md-4 text-center">
				<h2 class="textoLabel">Ver funciones</h2>
			</div>
			<div class="col-md-4 text-center">
				<h2 class="textoLabel">Elegir Plataforma</h2>
			</div>
		</div>
		<hr align="center" size="5px" style="color: #ffffff">
		<div class="d-flex justify-content-center">
			<form action="ConsultaFuncionDeEspectaculo" method="post">
				<input type="hidden" name="estado" value="espectaculos">
				<%if(plataformas!=null) { %>
				<div class="input-group mb-3">
					<div class="row">
						<div class="col-12">
							<div class="input-group-prepend">
								<label class="input-group-text mb-3 p-1" for="plataformas">Plataforma</label>
							</div>
						</div>
						<div class="col-12">
							<select class="custom-select w-100 p-1 mb-3" id="nomPlat" name="nomPlat">
								<option selected>Seleccione plataforma</option>
								<%for(String plat: plataformas){ %>
								<option value="<%=plat.toString() %>"><%=plat.toString()%></option>
								<% } %>
							</select>
						</div>
						<div class="col-12 d-flex">
							<button type="submit" class="btn btn-success w-100 p-1">Cargar
								Espectaculos</button>
						</div>
					</div>
				</div>
				<% } %>
			</form>
		</div>
	</div>	

		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</body>
</html>