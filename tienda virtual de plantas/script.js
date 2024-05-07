// Obtener los elementos necesarios del DOM
const btnMenu = document.querySelector("#btn-menu");
const menu = document.querySelector("#menu");
const categoriasLinks = document.querySelectorAll(".categorias a");

// Función para mostrar y ocultar el menú en dispositivos móviles
function toggleMenu() {
  menu.classList.toggle("mostrar");
}

// Agregar el evento click al botón del menú
btnMenu.addEventListener("click", toggleMenu);

// Función para filtrar las plantas por categoría
function filtrarPlantas(categoria) {
  const plantas = document.querySelectorAll(".tienda li");
  plantas.forEach(planta => {
    if (planta.dataset.categoria === categoria || categoria === "todos") {
      planta.classList.remove("oculto");
    } else {
      planta.classList.add("oculto");
    }
  });
}

// Agregar el evento click a cada enlace de categoría
categoriasLinks.forEach(link => {
  link.addEventListener("click", () => {
    const categoria = link.dataset.categoria;
    filtrarPlantas(categoria);
  });
});


$(document).ready(function(){
    var testimoniosCarousel = $('.testimonios-carousel');
    testimoniosCarousel.slick({
      dots: true,
      arrows: false,
      infinite: true,
      speed: 500,
      slidesToShow: 1,
      slidesToScroll: 1
    });
    
    $('.anterior').click(function(){
      testimoniosCarousel.slick('slickPrev');
    });
    
    $('.siguiente').click(function(){
      testimoniosCarousel.slick('slickNext');
    });
  });
  
  