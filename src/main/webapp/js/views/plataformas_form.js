import { Fetcher, formatDate } from '../helpers/index.js'
import { h, Component, render } from 'https://unpkg.com/preact?module';


const fetcher = new Fetcher();

const dropdownMenuButton = document.getElementById('dropdownMenuButtonPlataformas')

//trae las plataformas desde la base de datos y crea los <a href="#" class="dropdown-item"></a>
const setPlataformas = async () => {
    dropdownMenuButton.innerText = 'Cargando'
    
    const plataformas = await fetcher.getPlataformasForm()
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
                document.getElementById('dropdownMenuButtonPlataformas').textContent = item.name
            }
        }, item.name)

        items.push(a_element)
        })
        
        const dropPlataformas = h(
            'div', {
            class: 'dropdown-menu',
            'aria-labelledby': 'dropdownMenuButton'
        }, items)
      
    render(dropPlataformas, document.querySelector('#dropdownPlataformas'))

    return items[0].__e// retorno la primera plataforma
}


setPlataformas()
.then(res => {
    //Recargo los elementos de la primera plataforma
    //para que aparezcan al ingresar a la pagina
    dropdownMenuButton.innerText = res.innerText
})
.catch( err => {
    console.log(err)
})