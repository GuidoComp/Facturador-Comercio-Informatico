package ComercioInformatico;

public class Test {

    /*
    Reglas de negocio:
        *Precio total de insumos: se deriva de su precio de lista y su porcentaje de ganancia especificado por constructor.
        *Precio de servicios de armado: cantidad de horas por el valor por hora.
        *Precio de servicios de reparación: cantidad de horas por el valor por hora, más 25% de aumento si tiene una dificultad de nivel 3 o mayor.
        *Facturación de insumos: sobre su precio se suma el IVA.
        *Facturación de servicios: sobre su precio se suma la mitad del IVA.
     */
    public static ComercioInformatico c = new ComercioInformatico("Compragamer");

    public static void main(String[] args) {
        ServicioDeArmado sArm1 = new ServicioDeArmado(5);
        ServicioDeArmado sArm2 = new ServicioDeArmado(2);
        ServicioDeReparacion sRep1 = new ServicioDeReparacion(3, Dificultad.NIVEL2);
        ServicioDeReparacion sRep2 = new ServicioDeReparacion(3, Dificultad.NIVEL4);
        ServicioDeReparacion sRep3 = new ServicioDeReparacion(2, Dificultad.NIVEL1);
        Insumo in1 = new Insumo("Procesador", TipoInsumo.HARDWARE, 0.15, 50000);
        Insumo in2 = new Insumo("Teclado", TipoInsumo.PERIFERICO, 0.25, 10000);
        c.agregarProducto(sArm1);
        c.agregarProducto(sArm2);
        c.agregarProducto(sRep1);
        c.agregarProducto(sRep2);
        c.agregarProducto(sRep3);
        c.agregarProducto(in1);
        c.agregarProducto(in2);

        montoTotalFacturado();
        cantServiciosSimples();
    }

    public static void montoTotalFacturado() {
        System.out.println("Probando mostrar el monto total facturado: $" + c.montoTotalFacturado());
    }

    public static void cantServiciosSimples() {
        System.out.println("Probando cantidad de servicios simples: " + c.cantServiciosSimples());
    }
    /*
    Resultado:
    Probando mostrar el monto total facturado: $88374.125
    Probando cantidad de servicios simples: 1
     */

}
