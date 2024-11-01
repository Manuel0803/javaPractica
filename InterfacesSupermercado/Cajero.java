package InterfacesSupermercado;

public class Cajero extends Empleado implements Informes {
    
    private int numeroCaja;

    public Cajero(String nombre, String apellido, String DNI, int numeroCaja) {
        super(nombre, apellido, DNI);
        this.numeroCaja = numeroCaja;
    }

    @Override
    public double verParticularidades(Empleado empleado) {
        return empleado.getSueldo();
    }

    @Override
    public double verSueldo(Empleado empleado) {
        return 0;
    }
    
    

}
