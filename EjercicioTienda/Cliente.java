package EjercicioTienda;

public class Cliente {

    private String nombre;
    private String correo;
    private String numTelefono;
    private int idCliente;
    
    public Cliente() {
    }

    public Cliente(String nombre, String correo, String numTelefono, int idCliente) {
        this.nombre = nombre;
        this.correo = correo;
        this.numTelefono = numTelefono;
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", correo=" + correo + ", numTelefono=" + numTelefono + ", idCliente="
                + idCliente + "]";
    }

    

}
