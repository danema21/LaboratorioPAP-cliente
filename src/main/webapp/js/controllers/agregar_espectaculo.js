import { Fetcher } from '../helpers/fetcher.js'

const fetcher = new Fetcher()
const form = document.getElementById("form")
const alert_form = document.querySelector('.alert')
const inputFeilds = document.querySelectorAll("[required]")

form.submit_btn.addEventListener('click', async (e) => {
    e.preventDefault()
    if(checkInputs()) {
        infoAlert("alert-warning", "Rellene todos los campos")
    } else {
        const res = await fetcher.addEspectaculo({
            "nombre": form.nombre.value,
            "descripcion": form.descripcion.value,
            "duracion": form.duracion.value,
            "min_espectadores": form.min_espectadores.value,
            "max_espectadores": form.max_espectadores.value,
            "url": form.url.value,
            "costo": form.costo.value,
            "imagen": form.imagen.value !== "" ? `img/espectaculos/${form.imagen.value.split('\\')[2]}` : "",
            "plataforma": form.dropdownMenuButtonPlataformas.textContent,
            "artista": form.dropdownMenuButtonArtistas.textContent,
            "request_type": "1"
        })
        
        if(res.ok) {
            infoAlert("alert-success","Espectaculo agregado correctamente")
            clearInputs()
        } else {
            infoAlert("alert-danger", res.error.split(': ')[1])
        }
    }
})

const infoAlert = (type, desc) => {
    alert_form.style.display = 'block'
    alert_form.classList.add(type)
    alert_form.textContent = desc
    alert_form.animate([
        {opacity: 0},
        {opacity: 1}
    ],{
        duration: 200
    })

    setTimeout(() => {
        alert_form.animate([
            {opacity: 1},
            {opacity: 0}
        ],{
            duration: 200
        })
    }, 2800)

    setTimeout(() => {
        alert_form.style.display = 'none'
        alert_form.classList.remove(type)
    }, 3000)
}

const checkInputs = () => {
    const emptyInputs = Array.from(inputFeilds).some( input => input.value === "")
    return emptyInputs
}

const clearInputs = () => {
    Array.from(inputFeilds).forEach(item => item.value = "")
    form.descripcion.value = ""
    form.imagen.value = ""
}


