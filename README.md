Este programa está diseñado para modelar y calcular la conversión de divisas utilizando diferentes fuentes u operadores de tasas de cambio (como entidades oficiales del banco central o cotizaciones de mercados financieros privados) mediante el uso de herencia con clases abstractas, métodos abstractos y una clase conversora centralizada utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase abstracta ProveedorTasaCambio: Establece la plantilla base y encapsula atributos comunes (como el nombre de la fuente comercial nombreProveedor), además de declarar el método abstracto double obtenerTasa(String monedaOrigen, String monedaDestino) que obliga a las subclases a implementar su propia lógica de consulta de cotización.

Implementa clases concretas (TasaBancoCentral, TasaMercadoLibre): Extienden la clase abstracta sobrescribiendo el método con valores simulados de cotización (por ejemplo, tipos de cambio oficiales regulados frente a cotizaciones libres de mercado).

Diseña la clase ConversorMoneda: Actúa como el orquestador que mantiene una asociación con el proveedor abstracto, permitiendo realizar operaciones matemáticas de conversión y cambiar de fuente de tasas de forma dinámica en tiempo de ejecución.

Ejecuta la prueba polimórfica (main): Instancia un conversor utilizando distintas fuentes de tasas de cambio de forma polimórfica, procesa un monto base y muestra el resultado detallado de la operación por consola.
