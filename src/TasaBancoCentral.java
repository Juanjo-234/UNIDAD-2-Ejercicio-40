public class TasaBancoCentral extends  ProveedorTasaCambio{

    @Override
    public double obtenerTasa(String monedaOrigen, String monedaDestino) {
        System.out.println("Consultando tasa oficial regulada");
        if (monedaOrigen.equalsIgnoreCase("USD") && monedaDestino.equalsIgnoreCase("ARS")) {
            return 950.0;
        }
        return 1.0;
    }
}
