/*Para visualizar el menu*/
let enlacesHeader = document.querySelectorAll(".enlaces-header")[0];
let semaforo = true;

document.querySelectorAll(".botonMenu")[0].addEventListener("click", () => {
  if (semaforo) {
    document.querySelectorAll(".botonMenu")[0].style.color = "#fff";
    semaforo = false;
  } else {
    document.querySelectorAll(".botonMenu")[0].style.color = "#000";
    semaforo = true;
  }
  enlacesHeader.classList.toggle("menumov")
});

/*animacion del boton menu*/
const menuBtn = document.querySelector(".botonMenu");
let menuOpen = false;
menuBtn.addEventListener("click", () => {
  if (!menuOpen) {
    menuBtn.classList.add("open");
    menuOpen = true;
  } else {
    menuBtn.classList.remove("open");
    menuOpen = false;
  }
});
