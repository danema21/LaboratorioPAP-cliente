<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<title>Seleccionar Funcion.</title>

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
		String nomPlat = (String) request.getAttribute("nomPlat");
		String nomEsp = (String) request.getAttribute("nomEsp");
		String funciones[]=null;
		if (mostrar!=null && mostrar.equals("funciones")){
			funciones = (String[])request.getAttribute("funciones");
		}
		%>	
		
	<%@include file="nav.jsp" %>
		
	<div class="container md-w-75 p-3">
		<div class="row mb-4 d-flex justify-content-between">
			<div class="col-md-4 text-center">
				<h2 class="textoLabel">Ver funciones</h2>
			</div>
			<div class="col-md-4 text-center">
				<h2 class="textoLabel">Elegir Funcion</h2>
			</div>
		</div>
		
		<hr align="center" size="5px" style="color: #fff">
		
		<form action="ConsultaFuncionDeEspectaculo" method="post">
			<div class="d-flex justify-content-between bd-highlight mb-3">
				<input type="hidden" name="estado" value="plataformas">	
				<div class="p-2 align-self-center bd-highlight">
		  			<label class= "text-light "><%=nomPlat.toString()%></label>
		  		</div>
		  		<div class="p-2 bd-highlight">
		  			<button type="submit" class="btn btn-success m-1 p-1">Cambiar Plataformar</button>
		  		</div>		  	
			</div>
		</form>
		
		<hr align="center" size="5px" style="color: #fff">
		
<form action="ConsultaFuncionDeEspectaculo" method="post">
			<div class="d-flex justify-content-between bd-highlight mb-3">
				<input type="hidden" name="estado" value="espectaculos">	
				<input type="hidden" name="nomPlat" value="<%=nomPlat.toString()%>">
				<div class="p-2 align-self-center bd-highlight">
		  			<label class="text-light"><%=nomEsp.toString()%></label>
		  		</div>
		  		<div class="p-2 bd-highlight">
		  			<button type="submit" class="btn btn-success m-1 p-1">Cambiar Espectaculo</button>
		  		</div>		  	
			</div>
		</form>
		
		<hr align="center" size="5px" style="color: #fff">
		
		<div class="d-flex justify-content-center">			
			<form action="ConsultaFuncionDeEspectaculo" method="post">
			 	<input type="hidden" name="estado" value="mostrarFun">
			 	<input type="hidden" name="nomPlat" value="<%=nomPlat.toString()%>">
			 	<input type="hidden" name="nomEsp" value="<%=nomEsp.toString()%>">			 	
			 	<%if(funciones!=null) { %>
				<div class="row">
					<div class="col-12">
						<div class="input-group-prepend">
								<label class="input-group-text mb-3 p-1" for="espectaculos">Espectaculos</label>
						</div>
					</div>
					<div class="col-12">
						<select class="custom-select w-100 p-1 mb-3" id="nomFun" name="nomFun">
						<option selected>Seleccione Funcion</option>
					<%for(String func: funciones){ %>
						<option value="<%=func.toString() %>"><%=func.toString()%></option>
					<% } %>
					</select>
					</div>
					<div class="col-12 d-flex">
						<button type="submit" class="btn btn-success w-100 p-1">Mostrar Funciones</button>
					</div>
					<% } %>
				</div>					
			</form>					
		</div>
	</div>	

	
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</body>
</html>