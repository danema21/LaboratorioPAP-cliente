<script src="https://kit.fontawesome.com/56195d71f9.js"
	crossorigin="anonymous"></script>

<style>
.navbar {
	background: rgba(0, 0, 0, 0.6);
	z-index: 0;
}
</style>

<nav class="navbar navbar-expand-md navbar-dark fixed-top">
	<div class="container-fluid p-1">
		<%
		if (session.getAttribute("usuario") != null) {
		%>
		<ul>
			<li class="nav-item" id="nav-item-perfilLogeado"><%@include
					file="/perfilLogeado.jsp"%></li>
		</ul>
		<%}%>
		<a class="navbar-brand" id="navbar-brand" href="index.jsp">CoronaTickets.uy</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav" style="margin: 0 auto; margin-right: 0">
				<%if (session.getAttribute("usuario") != null) {%>
				<li class="nav-item" id="nav-item">
					<form action="ConsultaFuncionDeEspectaculo" method="post"
						name="formCFE"></form> <a class="nav-link"
					onclick="document.formCFE.submit()" href="#"> <i
						class="fas fa-ticket-alt"> </i> Funciones de Espectaculos
				</a>
				</li>
				<li class="nav-item" id="nav-item">
					<a href="consultaEspectaculo.jsp" class="nav-link"> 
					<i class="fas fa-ticket-alt"></i> Consulta de Espectaculo
				</a>
				</li>
				<%} %>
				
				<%
				if (session.getAttribute("usuario") != null) {
				%>
				<li class="nav-item" id="nav-item-cerrarSesion"><a
					class="nav-link" href="CerrarSesion"> <i
						class="fas fa-sign-out-alt"></i>Cerrar Sesion
				</a></li>
				<%
				}
				%>
			</ul>
		</div>
	</div>
</nav>
