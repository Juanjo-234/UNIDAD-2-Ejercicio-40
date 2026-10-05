public class ConversorMoneda {
    private ProveedorTasaCambio proveedor;

    public ConversorMoneda(ProveedorTasaCambio proveedor) {
        this.proveedor = proveedor;
    }

    public void setProveedor(ProveedorTasaCambio proveedor) {
        this.proveedor = proveedor;
    }

    public double convertir(double monto, String monedaOrigen, String monedaDestino) {
        double tasa = proveedor.obtenerTasa(monedaOrigen, monedaDestino);
        return monto * tasa;
    }
}
