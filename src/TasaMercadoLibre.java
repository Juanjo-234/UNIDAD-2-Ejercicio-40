public class TasaMercadoLibre extends  ProveedorTasaCambio{
    @Override
    public double obtenerTasa(String monedaOrigen, String monedaDestino) {
        System.out.println("Consultando tasa libre del mercado");
        if (monedaOrigen.equalsIgnoreCase("USD") && monedaDestino.equalsIgnoreCase("ARS")) {
            return 1250.0;
        }
        return 1.0;
    }
}
