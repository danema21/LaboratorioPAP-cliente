<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
    <title>Consulta Espectaculos</title>
    <style><%@include file="css/style_ce.css"%></style>
</head>
<body>
    <jsp:include page="nav.jsp" /> 
    <div class="container" id="container">
        <div class="row seleccion-plataforma" id="seleccion-plataforma">
                <div class="col-4 content-plataforma">
                    <p class="text-white text mr-2">Plataformas:</p>

                    <div class="dropdown">
                        <button class="btn btn-success dropdown-toggle shadow" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Cargando
                        </button>
                    </div>
                </div>
        </div>
           
        <div id="container-espectaculos">
        </div>
        
    </div>
    
    <div class="modal-espectaculo shadow" id="modal-espectaculo">
        <button class="close-btn" id="close"><i class="fas fa-times"></i></button>
        <div class="img-container" id="img-container">
            <img src="" alt="" id="modal-img">
        </div>

        <div class="text-container">
            <h2 class="text-title" id="modal-title"></h2>
            <p class="text" id="description"></p>
            <div class="container-info">
<!--                <div class="titles-info" id="titles-info">
                    <p class="title-info">Duracion en minutos</p>
                </div>
                <div class="info" id="info">
                    <p class="info-item text-success" id="duracionMin"></p>
                </div>-->
            </div>
        </div>
    </div>
    
    <div class="modal-espectaculo shadow" id="modal-funciones">
        <button class="close-btn" id="back"><i class="fas fa-chevron-left"></i></button>
        <h2 class="text-title" id="modal-title-funcion"></h2>
        <div id="container-modal-funciones"></div>
    </div>

    <div class="img-display" id="img-display">
        <img src="" alt="" id="show-img">
        <button class="close-btn" id="close-img-display">CERRAR</button>
    </div>
    
    <div class="overlay"></div>
    
    <div id="app"></div>
    
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootbox.js/5.5.2/bootbox.js" integrity="sha512-K3MtzSFJk6kgiFxCXXQKH6BbyBrTkTDf7E6kFh3xBZ2QNMtb6cU/RstENgQkdSLkAZeH/zAtzkxJOTTd8BqpHQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script type="module" src="js/views/plataforma.js"></script>
        <script type="module" src="js/modal.js"></script>
</body>
</html>