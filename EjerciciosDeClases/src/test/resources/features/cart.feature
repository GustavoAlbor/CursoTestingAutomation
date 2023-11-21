# language: es

Característica: Cart

  Escenario: Agregar un producto al carrito
    Dado que el usuario ingresa a la pagina de opencart y se loguea exitosamente
    Cuando agrega un producto al carrito
    Entonces se valida que el producto este agregado al carrito
