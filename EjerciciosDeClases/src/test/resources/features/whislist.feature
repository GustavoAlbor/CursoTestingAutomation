# language: es

  Característica: WishList

    Escenario: agregar un producto a favoritos
      Dado que el usuario ingresa a la pagina de opencart
      Y el usuario ingresa al login
      Y el usuario ingresa credenciales validas
      Cuando el usuario selecciona la pestaña Camera
      Y agrega un producto a favoritos
      Y el usuario ingresa a la Wish List
      Entonces se valida que el producto este agregado a la Wish List
