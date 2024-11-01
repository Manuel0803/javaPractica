package InterfacesSupermercado;

public class Empleado extends Persona{

    private int cantidadHoras;
    private int sueldo;


    public Empleado(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.cantidadHoras = cantidadHoras;
        this.sueldo = sueldo;
    }


    public int getCantidadHoras() {
        return cantidadHoras;
    }


    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }


    public int getSueldo() {
        return sueldo;
    }


    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }



    
}