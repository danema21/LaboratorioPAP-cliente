import { Fetcher, formatDate } from '../helpers/index.js'
import { h, Component, render } from 'https://unpkg.com/preact?module';


const fetcher = new Fetcher();

const dropdownMenuButton = document.getElementById('dropdownMenuButtonArtistas')

//trae los artistas desde la base de datos y crea los <a href="#" class="dropdown-item"></a>
const setArtistas = async () => {
    dropdownMenuButton.innerText = 'Cargando'
    
    const artistas = await fetcher.getArtistas()
    const items = []
    if (artistas[0].error !== undefined) {
        throw artistas[0].error
    }
        artistas.forEach(item => {
        const a_element = h(
            'a', {
            href: '#',
            class: 'dropdown-item',
            onclick: () => {
                document.getElementById('dropdownMenuButtonArtistas').textContent = item.name
            }
        }, item.name)

        items.push(a_element)
        })
        
        const dropArtistas = h(
            'div', {
            class: 'dropdown-menu',
            'aria-labelledby': 'dropdownMenuButton'
        }, items)
      
    render(dropArtistas, document.querySelector('#dropdownArtistas'))

    return items[0].__e// retorno la primera plataforma
}


setArtistas()
.then(res => {
    //Recargo los elementos de la primera plataforma
    //para que aparezcan al ingresar a la pagina
    dropdownMenuButton.innerText = res.innerText
})
.catch( err => {
    console.log(err)
})