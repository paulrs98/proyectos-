const botonesAgregar = document.querySelectorAll(".tienda button");

botonesAgregar.forEach(boton => {
  boton.addEventListener("click", () => {
    // Obtener los datos del producto
    const nombre = boton.previousElementSibling.previousElementSibling.textContent;
    const precio = boton.previousElementSibling.textContent.replace("$", "");
    const imagen = boton.parentElement.querySelector("img").getAttribute("src");

    // Crear el elemento del producto en el carrito de compras
    const itemCarrito = document.createElement("li");
    itemCarrito.innerHTML = `
      <img src="${imagen}" alt="${nombre}">
      <div>
        <h4>${nombre}</h4>
        <p>$${precio}</p>
      </div>
      <button class="eliminar">&times;</button>
    `;

    // Agregar el producto al carrito de compras
    const listaCarrito = document.querySelector("#carrito-lista");
    listaCarrito.appendChild(itemCarrito);

    // Actualizar el precio total y la cantidad de productos en el carrito
    actualizarCarrito();
  });
});

const listaCarrito = document.querySelector("#carrito-lista");

listaCarrito.addEventListener("click", event => {
  if (event.target.classList.contains("eliminar")) {
    event.target.parentElement.remove();
    actualizarCarrito();
  }
});

function actualizarCarrito() {
    const listaCarrito = document.querySelectorAll("#carrito-lista li");
    const totalProductos = listaCarrito.length;
    let totalPrecio = 0;
  
    listaCarrito.forEach(item => {
      const precio = item.querySelector("p").textContent.replace("$", "");
      totalPrecio += parseFloat(precio);
    });
  
    const carritoTotal = document.querySelector("#carrito-total");
    const carritoPrecio = document.querySelector("#carrito-precio");
  
    carritoTotal.textContent = totalProductos;
    carritoPrecio.textContent = totalPrecio.toFixed(2);
  }
  