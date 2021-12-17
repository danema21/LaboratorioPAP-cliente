//EN ESTA CLASE SE MANEJAN LAS PETICIONES AL SERLVET

//TRABAJO CON DOS HERRAMIENTAS DE JAVASCRIPT:
//- ASYNC/AWAIT
//- FETCH API

//ASYNC/AWAIT
//ES UNA FORMA MAS AGIL DE TRABAJAR CON PROMESAS (OTRA HERRAMIENTA DE JS)
//https://www.w3schools.com/js/js_promise.asp
//https://www.w3schools.com/js/js_async.asp
//
//LAS PROMESAS TRABAJAN CON UN REJECT Y UN RESOLVE
//SI UNA OPERACION SE REALIZA CON EXITO, SE DEVUELVE UN RESOLVE.
//SI NO HAY EXITO EN LA OPERACION, SE DEVUELVE UN REJECT
//CON ASYNC LE ESTAMOS DICIENDO A LA FUNCION "VAS A TENER QUE ESPERAR ALGO" (POR EJEMPLO, DATOS DEL SERVIDOR)
//Y CON AWAIT ESPERA.

//FETCH SIRVE PARA GENERAR REQUEST A SERVIDORES
//ESTAS PETICIONES AL SER MANEJADAS POR JS NO HACE FALTA RECARGAR LA PAGINA
//https://www.w3schools.com/js/js_api_fetch.asp
//https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch
        
class Fetcher {
    constructor() {}
    //en este caso, espero a que el servidor me devuleva las plataformas
    async getPlataformas() {
        const result = await fetch('ConsultaEspectaculo', {
            method: 'GET',//el metodo que se utiliza
            headers: {'Content-Type': 'application/json'}//el tipo de contenido que quiero que me devuelva
        })
        
        //fetch devuelve una respuesta HTTP, para tomar lo que esta en el body de la respuesta se utiliza .json()
        const list = await result.json()
        
        return list
    }
    
    async getEspectaculos(espectaculo) {
        const result = await fetch(`MostrarEspectaculo?name=${espectaculo}`, {
            method: 'GET',
            headers: {'Content-Type': 'application/json'},
        })
        const list = await result.json()
        console.log(list)
        return list
    }
    
    async addEspectaculo(espectaculo) {
        const result = await fetch('AltaEspectaculo', {
            method: 'POST',
            headers: {'Content-Type': 'application/x-www-form-urlencoded'},
            body:   formData(espectaculo)
        })
        const res = await result.json()
        return res
    }
    
    async getPlataformasForm() {
        const result = await fetch('AltaEspectaculo?request_type=2', {
            method: 'GET',//el metodo que se utiliza
            headers: {'Content-Type': 'application/json'}//el tipo de contenido que quiero que me devuelva
        })
        
        //fetch devuelve una respuesta HTTP, para tomar lo que esta en el body de la respuesta se utiliza .json()
        const list = await result.json()
        
        return list
    }
    
    async getArtistas() {
        const result = await fetch('AltaEspectaculo?request_type=3', {
            method: 'GET',//el metodo que se utiliza
            headers: {'Content-Type': 'application/json'}//el tipo de contenido que quiero que me devuelva
        })
        
        //fetch devuelve una respuesta HTTP, para tomar lo que esta en el body de la respuesta se utiliza .json()
        const list = await result.json()
        
        return list
    }
}

const formData = (espectaculo) => {
    let data = ''
    
    for(let i in espectaculo) {
        data = data + `${i}=${espectaculo[i]}&`
    }
    
    return data
}

export { Fetcher }
//export se utiliza para exportar componentes de un archivo a otros, es decir, podes trabajar con estos componentes en otros archivos.