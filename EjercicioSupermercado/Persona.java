public class Persona {
    
    private String nombre;
    private String apellido;
    private int dni;

    public Persona() {
    }
    
    public Persona(String apellido, int dni, String nombre) {
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDNI: " + this.dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    
    
    


}
