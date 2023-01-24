#language:es

@DEMO_CARLOS
Característica: Validacion de interacciones en RahulShettyPage

#  Antecedentes: Identificacion para acceder a los modulos
#    Dado que me encuentro en la pagina de rahulshetty
#    Cuando me dirigo a la categoria "Practice"
#    Y me identifico con nombre: "Carlos David" y correo: "carlos9cubas@gmail.com"
#    Entonces valido que accedo correctamente a la seccion practice "OUR PROJECTS"

  @TEST-0010
  Escenario: Ordenamiento alfabetico de items en el carrito de compras
    #Dado que me encuentro en la seccion "Automation Practice - 1"
    Y me dirijo al modulo "Top Deals" de GreenKart
    Cuando ordeno la lista por orden alfabetico
    Entonces valido que los productos se muestran en orden alfabetico correctamente
    
    @TEST-0020
  Escenario: Ordenamiento alfabetico de items en el carrito de compras v2
    #Dado que me encuentro en la seccion "Automation Practice - 1"
    Y me dirijo al modulo "Top Deals" de GreenKart








