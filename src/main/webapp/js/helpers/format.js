const formatDate = (date) => {
    const spaces = date.split(' ')
    if(spaces[2] === undefined) {
        const hyphen = spaces[0].split('-')
        return `${hyphen[2]}/${hyphen[1]}/${hyphen[0]}`
    }
    return date
}

const formatHTTP = (url) => {
    let web = url.split('//'), 
        withoutHTTPS = ''
    
    if (web[0] === 'https:') return url
    
    withoutHTTPS = web[0].split('.')
    
    if (withoutHTTPS.length === 3)
        return `https://${url}`
    
    return `https://www.${url}`
}

export { formatDate, formatHTTP }