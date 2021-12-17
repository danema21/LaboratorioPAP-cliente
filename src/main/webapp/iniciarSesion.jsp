<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@page import="publicadores.DtUsuario"%>
<!doctype html>
<html>
	<head>
		<!-- Required meta tags -->
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- Bootstrap CSS -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<title>Iniciar Sesion</title>
	</head>
	<style>
		body{
			background: url("img/webb-dark.png");
			background-repeat: repeat;
		}
		
		.textoLabel{
			color: #F7F0F5;
		}
		
		.container{
			margin: 0 auto;
			margin-top: 120px;
			background: rgba(0, 0, 0, 0.6);
			border-radius: 15px;
		}
	</style>
	<body>
		<%@include file="/nav.jsp"%>
		<%String userId = null;
		Cookie[] cks = request.getCookies();
		boolean cookieEsta = false;
		for(int i = 0; i < cks.length; i++){
			Cookie ck = cks[i];
			if(ck.getName().equals("userid")){
				userId = ck.getValue();
				cookieEsta = true;
			}
		}%>
		
		<div class="container md-w-75 p-3">
			<h1 class="mb-4 textoLabel">Iniciar Sesion</h1>
			<form action="IniciarSesion" method="post">
				<%if(cookieEsta){ %>
					<div class="mb-3">
					  <label for="formGroupExampleInput" class="form-label textoLabel">Email o nickname</label>
					  <input type="text" class="form-control" name="inputUser" value="<%=userId%>">
					</div>
					<div class="mb-3">
					  <label for="formGroupExampleInput2" class="form-label textoLabel">Password</label>
					  <input type="password" class="form-control" name="inputPassword">
					</div>
					<div class="mb-3">
					  <label for="formGroupExampleInput3" class="form-label textoLabel"><input type="checkbox" id="conCk" name="recordarCheckboxConCk" value="on" checked onclick="chequearRecordar()"> Recordar nombre de usuario</label>
					</div>
				<%}else{ %>
					<div class="mb-3">
					  <label for="formGroupExampleInput" class="form-label textoLabel">Email o nickname</label>
					  <input type="text" class="form-control" name="inputUser">
					</div>
					<div class="mb-3">
					  <label for="formGroupExampleInput2" class="form-label textoLabel">Password</label>
					  <input type="password" class="form-control" name="inputPassword">
					</div>
					<div class="mb-3">
					  <label for="formGroupExampleInput3" class="form-label textoLabel"><input type="checkbox" id="sinCk" name="recordarCheckboxSinCk" value="on" checked onclick="chequearRecordar()"> Recordar nombre de usuario</label>
					</div>
				<%} %>
				<div class="mb-3 text-center">
				  <button type="submit" class="btn btn-success w-50">Ingresar</button>
				</div>	
			</form>
		</div>
		<script type="text/javascript">
			function chequearRecordar() {
				if(document.getElementById("sinCk").value == "off" || document.getElementById("conCk").value == "off"){
					document.getElementById("sinCk").value = "on";
					document.getElementById("conCk").value = "on";
					
				}else if(document.getElementById("sinCk").value == "on" || document.getElementById("conCk").value == "on"){
					document.getElementById("sinCk").value = "off";
					document.getElementById("conCk").value = "off";
					
				}
			}
		</script>
	    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
	</body>
</html>