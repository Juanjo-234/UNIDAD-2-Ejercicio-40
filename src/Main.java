//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double montoAConvertir = 100.0; // USD
    String origen = "USD";
    String destino = "ARS";

    System.out.println("=== Conversión de " + montoAConvertir + " " + origen + " a " + destino + " ===\n");

    ConversorMoneda conversor = new ConversorMoneda(new TasaBancoCentral());
    double resultadoOficial = conversor.convertir(montoAConvertir, origen, destino);
    System.out.printf("Resultado (Banco Central): $%.2f %s\n\n", resultadoOficial, destino);

    conversor.setProveedor(new TasaMercadoLibre());
    double resultadoMercado = conversor.convertir(montoAConvertir, origen, destino);
    System.out.printf("Resultado (Mercado Libre): $%.2f %s\n", resultadoMercado, destino);
}

