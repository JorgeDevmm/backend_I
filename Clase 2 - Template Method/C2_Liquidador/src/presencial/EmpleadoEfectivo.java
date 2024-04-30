package presencial;

/**
 * @author Jorge Luis Monzón Morales
 * @project C2_Liquidador
 */
public class EmpleadoEfectivo extends  Empleado {
    private double sueldoBasico;
    private double descuento;
    private double premio;

    public EmpleadoEfectivo(String nombre, String apellido, String cuentaBancaria, double sueldoBasico, double descuento, double premio) {
        super(nombre, apellido, cuentaBancaria);
        this.sueldoBasico = sueldoBasico;
        this.descuento = descuento;
        this.premio = premio;
    }
}
