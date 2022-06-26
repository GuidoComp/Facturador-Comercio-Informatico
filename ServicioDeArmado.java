package ComercioInformatico;

public class ServicioDeArmado extends Servicio {

    private static final int valorPorHora = 250;

    public ServicioDeArmado(int cantHoras) {
        super(cantHoras);
    }

    @Override
    protected double precio() {
        return (double) this.getCantHoras() * valorPorHora;
    }
}
