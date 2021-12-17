<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="https://kit.fontawesome.com/56195d71f9.js" crossorigin="anonymous"></script>
<title>Error Nombre Funcion Repetido</title>
</head>
<body>
<!-- Button trigger modal -->

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel"><i class="fas fa-frown"></i> Error</h5>
      </div>
      <div class="modal-body">
       ${mensaje}
      </div>
      <div class="modal-footer">
        <a class="btn btn-secondary" href="iniciarSesion.jsp" role="button">Volver a inicio</a>         
      </div>
    </div>
  </div>
</div>


</body>
</html>
<style>
body{
	background: url("img/webb-dark.png");
	background-repeat: repeat;
	font-family: 'Poppins', sans-serif;
}
.navbar{
	position: relative;	
	background: rgba(0, 0, 0, 0.6);
}

</style>
<script type="text/javascript">
    $(window).on('load', function() {
        $('#exampleModal').modal('show');
    });
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>