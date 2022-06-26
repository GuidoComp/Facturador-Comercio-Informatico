package ComercioInformatico;

public abstract class Servicio extends ProductoFacturable {
    private int cantHoras;

    public Servicio(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    protected int getCantHoras() {
        return cantHoras;
    }

    protected abstract double precio();

    @Override
    protected double facturar(double iva) {
        double precio = this.precio();
        return (double) (precio * (iva / 2)) + precio;
    }
}
