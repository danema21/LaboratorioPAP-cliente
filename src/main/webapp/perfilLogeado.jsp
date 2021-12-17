<%//@page import="org.hibernate.internal.build.AllowSysOut"%>
<script src="https://kit.fontawesome.com/56195d71f9.js" crossorigin="anonymous"></script>
<%@page import="publicadores.DtUsuario"%>
<style>
	.perfil-container{
		position: relative;
		height: 50px;
		width: 50px;
		display: flex; 
	}
	/*imagen*/
	.imagen-container{
		width: 100%; 
		height:100%;
		border: 2px solid #5DC68A;
		border-radius: 100px;
		overflow: hidden;
	}
	.imagen-container img{
		width: 100%;
		height: 100%;
	}
	/*menu*/
	.menu{
		width: 150px;
		position: absolute;
		top: 58px;
		left: -100px;
		list-style: none;
		padding: 6px;
		margin: 0;
		background: rgba(93, 198, 138, 0.85);
		display: none;
		z-index: 1000;
		border-radius: 10px;
	}
	
	.menu.active {
		display: block;
	}
	.menu a{
		text-decoration: none;
		color: white;
	}
</style>
<div class="perfil-container" id="perfil-container">
	<%DtUsuario usuario = (DtUsuario) session.getAttribute("usuario");
	if(usuario != null){
	%>
	<div class="imagen-container">
		<%-- <img src="img/<%=session.getAttribute("imagenUsuario")%>" alt="pop"> --%>
		<%if (session.getAttribute("imagenUsuario")!= null){ %>
		<img src="<%=session.getAttribute("imagenUsuario")%>" alt="pop">
		<%}
		else{%>
		<img src="img/defaultUserImg.png" alt="pop">
		<%} %>
	</div>
	<%}%>
	<div class="opciones-container">
		<ul class="menu" id="menu" >
			<li class="menu-item"><label>Opciones:</label></li>
			<li class="menu-item"><a href="MostrarDatosUsuario">Modificar Datos</a></li>
		</ul>
	</div>
</div>


<!--  <script>
	const menu = document.getElementById('menu');
	const btnMenu = document.getElementById('perfil-container');
	btnMenu.addEventListener('click', function(){
		menu.classList.toggle('active');
	})
</script> -->