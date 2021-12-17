<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="publicadores.DtFuncion"%>
<%@page import="java.util.List"%>
<%@page import ="java.text.SimpleDateFormat"%>
<%@page import ="java.util.Calendar"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<title>Funcion de Espectaculo.</title>

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

	<%@include file="nav.jsp" %>
		
	<%DtFuncion dtf = (DtFuncion)request.getAttribute("funcion");
	String fecha = ""+dtf.getFecha().get(Calendar.DAY_OF_MONTH)+"/"+((int)dtf.getFecha().get(Calendar.MONTH)+1)+"/"+dtf.getFecha().get(Calendar.YEAR);
	String[] artistas = dtf.getArtistas();
	%>

	<div class="container md-w-75 p-3">
		<div class="row mb-4">
			<div class="col-md-12 d-flex justify-content-center">
				<div class="card mb-3" >
					<div class="row g-0">
						<div class="col-md-4">
							<%
							if (dtf.getUrlImg() == null) {
							%>
							<img src="img/espectaculos/espectaculo_default.png"
								class="img-fluid rounded-start" alt="...">
							<%
							} else {
							%>
							<img src="<%=dtf.getUrlImg().toString()%>"
								class="img-fluid rounded-start" alt="...">
							<%
							}
							%>
						</div>
						<div class="col-md-8 bg-success rounded">
							<div class="card-body text-light">
								<h5 class="card-title"><%=dtf.getNombre().toString()%></h5>
								<label id="label-1">Fecha: <%=fecha%>.</label>
								<p class="card-text">
									Hora de inicio:
									<%=dtf.getHoraInicio()%>
									hs.
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<%if(artistas != null) {
			int cont =0;%>
		</div>
		<div class="row mb-4">
			<div class="col-12 d-flex justify-content-center">
				<div class="card mb-3 w-100 bg-success">
					<h4 class="text-center text-light">Artistas invitados:</h4>
					<table class="table table-light">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">Artista</th>
							</tr>
						</thead>
						<%for(String art : artistas){ %>
						<tbody>
							<tr>
								<th scope="row"><%=cont+=1 %></th>
								<td><%=art %></td>
							</tr>
						</tbody>
						<%} %>
					</table>
				</div>
			</div>
		</div> 
		<%} %>
	</div>

	<script
			src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
			integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
			integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
			crossorigin="anonymous"></script>
</body>
</html>