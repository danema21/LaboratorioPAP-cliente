import { formatDate } from '../helpers/index.js'
import { h, Component, render } from 'https://unpkg.com/preact?module'

const createFuncion = (funcion) => {
    const info_items = []
    
    for(const i in funcion) {
        let item = funcion[i]
        
        if(i === 'fecha' || i === 'fecha_registro') {
            item = formatDate(item)
        }
        
        const info_item = h(
            'td',
            {},
            item
        )
        
        info_items.push(info_item)
    }
    
    return h(
        'tr',
        {},
        info_items
    )
}

const createFunciones = (funciones) => {
    const items = []
    
    funciones.forEach(item => {
        items.push(createFuncion(item))
    })
    
    return h('tbody', {}, items)
}

export { createFunciones }