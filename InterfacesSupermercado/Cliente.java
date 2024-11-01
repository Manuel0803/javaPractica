package InterfacesSupermercado;

public class Cliente extends Persona{

    	private boolean mayorista;
        private int numeroSocio;

    public Cliente(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.mayorista = mayorista;
        this.numeroSocio = numeroSocio;
    }

    public boolean isMayorista() {
        return mayorista;
    }

    public void setMayorista(boolean mayorista) {
        this.mayorista = mayorista;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    


}