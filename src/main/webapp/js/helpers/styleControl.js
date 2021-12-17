const styleControl = (element, styles) => {
    for(let s in styles) {
        element.style[`${s}`] = styles[s]
    }
}

export { styleControl }