import { Fetcher, formatDate } from '../helpers/index.js'
import { createEspectaculos } from '../views/espectaculo.js'
import { h, Component, render } from 'https://unpkg.com/preact?module';


const fetcher = new Fetcher();

//metodos usados:
//forEach: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach
//classList: https://www.w3schools.com/jsref/prop_element_classlist.asp
//addEventListener: https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener
//innerText: https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/innerText

const dropPlataformas = document.getElementById('dropPlataformas')
const dropdownMenuButton = document.getElementById('dropdownMenuButton')
const containerEspectaculos = document.getElementById('container-espectaculos')
const seleccion_plataforma = document.getElementById('seleccion-plataforma')

//trae las plataformas desde la base de datos y crea los <a href="#" class="dropdown-item"></a>
const setPlataformas = async () => {
    dropdownMenuButton.innerText = 'Cargando'
    
    const plataformas = await fetcher.getPlataformas()
    const items = []
    if (plataformas[0].error !== undefined) {
        throw plataformas[0].error
    }
        plataformas.forEach(item => {
        const a_element = h(
            'a', {
            href: '#',
            class: 'dropdown-item',
            onclick: () => {
                document.getElementById('dropdownMenuButton').textContent = item.name
                createEspectaculos(item.name)
            }
        }, item.name)

        items.push(a_element)
        })
        
        const dropPlataformas = h(
            'div', {
            class: 'dropdown-menu',
            'aria-labelledby': 'dropdownMenuButton'
        }, items)
      
    render(dropPlataformas, document.querySelector('.dropdown'))

    return items[0].__e// retorno la primera plataforma
}


setPlataformas()
.then(res => {
    //Recargo los elementos de la primera plataforma
    //para que aparezcan al ingresar a la pagina
    dropdownMenuButton.innerText = res.innerText
    createEspectaculos(res.innerText)

})
.catch( err => {
    console.log(err)
    seleccion_plataforma.style.visibility = 'hidden'
    container.classList.add('empty')
    const errorP = document.createElement('p')
    errorP.setAttribute('class', 'error-espectaculos')
    errorP.textContent = err === 'No hay Espectaculos Disponibles' ? err : 'Error en el servidor'
    container.appendChild(errorP)
})