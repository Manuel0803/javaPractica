public class Cliente extends Persona{
    
    private boolean mayorista;

    public Cliente(){

    }

    public Cliente(boolean mayorista, String apellido, int dni, String nombre) {
        super(apellido, dni, nombre);
        this.mayorista = mayorista;
    }
    
    @Override
    public String toString() {
        return "\n" + super.toString() + "\nMayorista: " + this.mayorista;
    }

    public boolean isMayorista() {
        return mayorista;
    }

    public void setMayorista(boolean mayorista) {
        this.mayorista = mayorista;
    }


    

}
