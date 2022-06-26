package ComercioInformatico;

import java.util.Stack;

public class ComercioInformatico {

    private static final double IVA = 0.21;
    private String nombre;
    private Stack<ProductoFacturable> productoFacturables;

    public ComercioInformatico(String nombre) {
        this.nombre = nombre;
        this.productoFacturables = new Stack<>();
    }

    protected double montoTotalFacturado() {
        double montoTotal = 0;
        for (ProductoFacturable p : productoFacturables) {
            montoTotal += p.facturar(IVA);
        }
        return montoTotal;
    }

    protected int cantServiciosSimples() {
        int cant = 0;
        ServicioDeReparacion serv = null;

        for (ProductoFacturable p : productoFacturables) {
            if (p instanceof ServicioDeReparacion) {
                serv = (ServicioDeReparacion) p;
                if (serv.esServicioSimple()) {
                    cant++;
                }
            }
        }
        return cant;
    }

    protected void agregarProducto(ProductoFacturable p) {
        this.productoFacturables.add(p);
    }
}
