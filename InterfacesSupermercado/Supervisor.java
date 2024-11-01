package InterfacesSupermercado;

public class Supervisor extends Empleado implements Jefe, Informes{

    private String sector;
    private int personasACargo;

    public Supervisor(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.sector = sector;
        this.personasACargo = personasACargo;
    }

    double sueldoCalculado = 0;

    @Override
    public double calcularSueldo(Empleado empleado) {
        sueldoCalculado = (empleado.getSueldo()*empleado.getCantidadHoras());
        return sueldoCalculado;
    }

    @Override
    public double verParticularidades(Empleado empleado) {
        return 0;
    }

    @Override
    public double verSueldo(Empleado empleado) {
        return empleado.getSueldo();
    }

    
    
}
