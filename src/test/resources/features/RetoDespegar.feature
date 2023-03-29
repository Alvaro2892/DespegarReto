Feature: Realizar busqueda segun la opcion requerida

  Scenario: Busqueda de servicio de alojamiento
    Given que he seleccionado la opcion de busqueda de servicio de alojamiento
    When selecciono un servicio de alojamiento dentro del rango de opciones disponibles luego ingreso los datos solicitados dependiendo del flujo de compra
      | origen    | destino |
      | Cartagena | Pereira |
    Then la busqueda del servicio de alojamiento se realiza correctamente