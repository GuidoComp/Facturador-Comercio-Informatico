package ComercioInformatico;

public enum Dificultad {
    NIVEL1(1),
    NIVEL2(2),
    NIVEL3(3),
    NIVEL4(4),
    NIVEL5(5);
    private int numero;

    Dificultad(int numero) {
        this.numero = numero;
    }
    protected int getNumero() {
        return this.numero;
    }
}
