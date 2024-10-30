package EjercicioIntegrador;

public class Planta {
    
    
    private String nombre;
    private String altoTallo;
    private String tieneHojas;
    private String climaIdeal;
    
    
    public Planta() {
    }


    public Planta(String nombre, String altoTallo, String tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getAltoTallo() {
        return altoTallo;
    }


    public void setAltoTallo(String altoTallo) {
        this.altoTallo = altoTallo;
    }


    public String getTieneHojas() {
        return tieneHojas;
    }


    public void setTieneHojas(String tieneHojas) {
        this.tieneHojas = tieneHojas;
    }


    public String getClimaIdeal() {
        return climaIdeal;
    }


    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public void decirLoQueSoy(){
        
    }





}
