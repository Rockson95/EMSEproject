const menu = document.querySelector('#App-Menu')
const menuLinks = document.querySelector('.navbar__Menu')
menu.addEventListener('click', function(){
    menu.classList.toggle('is-active')
    menuLinks.classList.toggle('active')
})