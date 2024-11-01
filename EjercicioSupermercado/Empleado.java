public class Empleado extends Persona {
    
     private double sueldo;

    public Empleado(){

    }

    public Empleado(double sueldo, String apellido, int dni, String nombre) {
        super(apellido, dni, nombre);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + "\nSueldo: " + this.sueldo;
    }

    
     
}
