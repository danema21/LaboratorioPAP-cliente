const close_img_display = document.getElementById("close-img-display")
const close = document.getElementById("close")
const back = document.getElementById("back")
const modal = document.getElementById('modal-espectaculo');
const modal_funciones = document.getElementById('modal-funciones')
const overlay = document.querySelector('.overlay')
const img_container = document.querySelector('.img-container')
const img_display = document.getElementById('img-display')
const info = document.getElementById('info')
const modal_title = document.getElementById('modal-title')
const modal_title_funcion = document.getElementById('modal-title-funcion')
const modal_img = document.getElementById('modal-img')
const show_img = document.getElementById('show-img')
const description = document.getElementById('description')

import { h, Component, render } from 'https://unpkg.com/preact?module';
import { createFunciones } from './views/funcion.js'
import { formatDate, formatHTTP, styleControl } from './helpers/index.js'


function preventDefault(e) {
    e.preventDefault()
}

close.addEventListener('click', () => {
    modalClose()
    window.removeEventListener('touchmove', preventDefault, false)
})

back.addEventListener('click', () => {
    styleControl(overlay, {background: 'rgba(0,0,0, .8)'})
    zindexModal(100, 110, 110)
    setTimeout(() => modal_funciones.classList.remove('active'),100)
})


overlay.addEventListener('click', () => {
    modalClose()
    window.removeEventListener('touchmove', preventDefault, false)
    zindexModal(100, 110, 110)
})
    
img_container.addEventListener('click', () => {
    img_display.classList.add('active')
    zindexModal(110, 100, 100)
    
    if (window.screen.width <= 1000) {
        styleControl(overlay, {background: '#000', height: '100vh'})
//        overlay.style.background = '#000'
//        overlay.style.height = '100vh'
    }
})

close_img_display.addEventListener('click', () => {
    img_display.classList.remove('active')
        
    styleControl(overlay, {background: 'rgba(0,0,0, .8)'})
    zindexModal(100, 110, 110)
})


//functions

const modalShow = (espectaculo) => {
    const titles = []
    const info_items = []
    const list_meta = []
    let titles_info = ''
    let info = ''
    let container = ''
    
    const info_nombres = [
        'Maximo Espectadores',
        'Costo',
        'Fecha de registro',
        'Duracion en minutos',
        'Minimo Espectadores',
        'Sitio Web',
        'Ver Funciones',
    ]
    
    let {
        name,
        descripcion,
        img,
        funciones,
        ...others
    } = espectaculo
   description.innerText = descripcion
   modal_title.innerText = name

    if (img === undefined) {
        styleControl(document.querySelector('.img-container'), {display: 'none'})
    } else {
        styleControl(document.querySelector('.img-container'), {display: 'block'})
        modal_img.src = img
        show_img.src = img
    }


    info_nombres.forEach(item => {
        let info_nombre = ''
        
        if (item === 'Ver Funciones') {
            info_nombre = h(
                'a',
                {
                    class: 'title-info', 
                    href: '#',
                    onclick: () => {
                        if(funciones !== undefined) return tablaFunciones({funciones, name})
                        
                        bootbox.alert({
                            message: "No hay funciones disponibles",
                            closeButton: false,
                            buttons: {
                                ok: {className: 'btn-success'}
                            }
                        })
                    }
                },
                item
            )
        } else {
            info_nombre = h(
                'p',
                {class: 'title-info'},
                item
            )
        }
        titles.push(info_nombre)
    })
    for(const i in others) {
        let item = espectaculo[i]
        
        if(i === 'fechaRegistro') {
            item = formatDate(espectaculo.fechaRegistro)
        }
        
        
        const info_item = i !== 'url'   ? h('p',{class: 'info-item text-success'},item)
                                        : h('a',{class: 'info-item text-success', href: formatHTTP(item), target: '_blank'},item)
                                    
        info_items.push(info_item)
    }
    
    //cambio de estructura
    if(window.screen.width > 768) {
        titles_info = h(
            'div',
            {class: 'titles-info'},
            titles
        )

        info = h(
            'div',
            {class: 'info'},
            info_items.sort()
        )
        
        container = h(
        'div',
        {class: 'container-info-espectaculo'},
        [titles_info, info]
    )
    } else {
        for (let i = 0; i < 6; i++) {
            const pair = h(
                'div',
                {class: 'info-meta'},
                [titles[i], info_items[i]]
            )
    
              list_meta.push(pair)
        }
        list_meta.push(titles[6])
        container = h(
            'div',
            {class: 'container-info-espectaculo-meta'},
            list_meta
        )
    }
    
    
    render(container, document.querySelector('.container-info'))

    modal.classList.add('active')
    overlay.classList.add('active')
    
}

const modalClose = () => {
    if (img_display.classList.contains('active')) {
        img_display.classList.remove('active')
        
        styleControl(overlay, {background: 'rgba(0,0,0, .8)'})
        zindexModal(100, 110, 110)

        
    } else {
        modal.classList.remove('active')
        modal_funciones.classList.remove('active')
        overlay.classList.remove('active')
    }
}

const tablaFunciones = (e) => {
    modal_funciones.classList.add('active')
    zindexModal(105, 100, 110)
    
    if (window.screen.width <= 1000) 
        styleControl(overlay, {background: '#000', height: '100vh'})

    modal_title_funcion.innerText = 'Funciones de ' + e.name
    const array_column_names = ['Fecha', 'Fecha Registro', 'Hora de Inicio', 'Nombre']
    const column_names = [] 

    array_column_names.forEach(item => {
        column_names.push(h(
                            'th',
                            {scope: 'col'},
                            item
                        ))
    })

    const table_titles = h(
                            'thead',
                            {},
                            h(
                                'tr',
                                {},
                                column_names
                            )
                        )
    const list = createFunciones(e.funciones)

    const container_funciones = h(
                                    'table',
                                    {class: 'table table-dark table-bordered'},
                                    [table_titles, list]
                                )

    render(container_funciones, document.getElementById('container-modal-funciones'))
}

const zindexModal = (ol, m, mf) => {
    styleControl(overlay, {zIndex: ol})
    styleControl(modal, {zIndex: m})
    styleControl(modal_funciones, {zIndex: mf})
}

export { modalShow, modalClose, preventDefault }
