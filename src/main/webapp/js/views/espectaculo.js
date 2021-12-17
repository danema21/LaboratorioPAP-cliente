import { Fetcher, formatDate } from '../helpers/index.js'
import { modalShow, preventDefault } from '../modal.js'
import { h, Component, render } from 'https://unpkg.com/preact?module'

const fetcher = new Fetcher();

const containerEspectaculos = document.getElementById('container-espectaculos');


//Funcion para crar un elemento
//https://www.w3schools.com/jsref/met_document_createelement.asp
//
//herramientas usadas:
//touch events: https://developer.mozilla.org/en-US/docs/Web/API/Touch_events
//scrollIntoView: https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView
//find: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/find

const newEspectaculo = (espectaculo) => {
    
const img = espectaculo.img !== undefined ? espectaculo.img : 'img/espectaculos/espectaculo_default.png'

return h(
	'div', {
 	class: 'col-md-6 col-lg-4'}, 
 	h(
            'div', 
            {
                class: 'card text-white bg-dark shadow',
                key: espectaculo.name,
                onclick: (e) => {
                    e.preventDefault()
                    window.addEventListener('touchmove', preventDefault, {passive: false})//deshabilita el scroll cuando el modal esta abierto
                    modalShow(espectaculo)
                    e.target.scrollIntoView({
                    behavior: 'auto',
                    block: 'center',
                    inline: 'center'
                })
                }
            }, 
            [h(
                'div', 
                {class: 'card-header'}, 
                [h(
                    'div',
                    {class: 'card-img-container'},
                    h(
                        'img',
                        {
                            class: 'card-img-top',
                            src: img,
                            alt: espectaculo.name
                        }
                    )
                ),
                h(
                    'h5',
                    {
                        class: 'card-title'
                    },
                    espectaculo.name
                )
                ]
            ),//card-header	
            h(
                'div',
                {class: 'card-body card-espectaculo'},
                [h(
                    'div',
                    {class: 'card-text-container'},
                    h(
                        'p',
                        {class: 'card-text text-truncate'},
                        espectaculo.descripcion
                    )
                ),
                h(
                    'p',
                    {class: 'dateText'},
                    formatDate(espectaculo.fechaRegistro)
                ),
                h(
                    'a',
                    {
                        class: 'card-link text-success show-espectaculo',
                        href: '#',
                        onclick: (e) => {
                            e.preventDefault()  
                            modalShow(espectaculo)
                        },
                    },
                    'Ver Mas'
                )
                ]
            )
            ]
    )
 )
}


const createEspectaculos = async (nombre_plataforma) => {
    const items = []
    
    const especs = await fetcher.getEspectaculos(nombre_plataforma)//guardo los espectaculos
    especs.forEach(e => {
        const espectaculo = newEspectaculo(e)// creo un elemento por cada espectaculo
        items.push(espectaculo)
     })
        const container_espectaculos = h(
            'div',
            {class: 'container-espectaculos row'},
            items
        )
        render(container_espectaculos, containerEspectaculos)
        
        container_espectaculos.__e.animate(
            [
                { opacity: 0, top: '10px' },
                { opacity: 1, top: '0px' }
            ], 
            {
                duration: 500
            }
        );
        setTimeout(() => {
            container_espectaculos.__e.classList.add('opacity_one')
        }, 500)
}

export { createEspectaculos }
