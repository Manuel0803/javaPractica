package EjercicioIntegrador;

public class Flor extends Planta {
    
    private String colorDePetalos;
    private String cantidadPromPetalos;
    private String colorDelPistilo;
    private String variedadDeFlor;
    private String estacionQueFlorece;
    
    public Flor(){
        
    }
    
    public Flor(String nombre, String altoTallo, String tieneHojas, String climaIdeal, String colorDePetalos,
            String cantidadPromPetalos, String colorDelPistilo, String variedadDeFlor, String estacionQueFlorece) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantidadPromPetalos = cantidadPromPetalos;
        this.colorDelPistilo = colorDelPistilo;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public String getCantidadPromPetalos() {
        return cantidadPromPetalos;
    }

    public void setCantidadPromPetalos(String cantidadPromPetalos) {
        this.cantidadPromPetalos = cantidadPromPetalos;
    }

    public String getColorDelPistilo() {
        return colorDelPistilo;
    }

    public void setColorDelPistilo(String colorDelPistilo) {
        this.colorDelPistilo = colorDelPistilo;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    @Override
    public String toString() {
        return "Flor [colorDePetalos=" + colorDePetalos + ", cantidadPromPetalos=" + cantidadPromPetalos
                + ", colorDelPistilo=" + colorDelPistilo + ", variedadDeFlor=" + variedadDeFlor
                + ", estacionQueFlorece=" + estacionQueFlorece + "]";
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy una flor");
    }




}
