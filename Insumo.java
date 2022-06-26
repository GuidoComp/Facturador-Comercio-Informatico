package ComercioInformatico;

public class Insumo extends ProductoFacturable {
    private String nombre;
    private TipoInsumo tipo;
    private double porcGanancia;
    private double precio;

    public Insumo(String nombre, TipoInsumo tipo, double porcGanancia, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.porcGanancia = porcGanancia;
        this.precio = precio;
    }

    @Override
    protected double facturar(double iva) {
        double precioSinIva = (double) (precio + (precio * porcGanancia));
        return (double) (precioSinIva * iva) + precioSinIva;
    }
}
