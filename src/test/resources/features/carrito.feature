@compras

Feature: Validación del carrito de compras en la aplicación SauceLabs

  Scenario Outline: Agregar productos al carrito de compras
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galería
    When agrego "<unidades>" unidad(s) del producto "<producto>"
    Then valido que el carrito de compras se actualice correctamente con <UNIDADES> unidad(s)

    Examples:
      | producto                  | unidades |
      | Sauce Labs Backpack       | 1        |
      | Sauce Labs Bolt - T-Shirt | 1        |
      | Sauce Labs Bike Light     | 2        |
