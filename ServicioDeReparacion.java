package ComercioInformatico;

public class ServicioDeReparacion extends Servicio {
    private static final double porcAumento = 0.25;
    private static final int valorPorHora = 180;
    private Dificultad dificultad;

    public ServicioDeReparacion(int cantHoras, Dificultad dificultad) {
        super(cantHoras);
        this.dificultad = dificultad;
    }

    @Override
    protected double precio() {
        double precio = (double) this.getCantHoras() * valorPorHora;
        return precio + this.incrementoPorDificultad(precio);
    }

    private double incrementoPorDificultad(double precio) {
        double incremento = 0;
        if (dificultad.getNumero() >= Dificultad.NIVEL3.getNumero()) {
            incremento = precio * porcAumento;
        }
        return incremento;
    }

    protected boolean esServicioSimple() {
        return this.dificultad.getNumero() < Dificultad.NIVEL2.getNumero();
    }
}
