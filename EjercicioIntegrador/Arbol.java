package EjercicioIntegrador;

public class Arbol extends Planta{
    
    private String variedad;
    private String tipoTronco;
    private String radioTrongo;
    private String color;
    private String tipoHojas;
    
    public Arbol(){
        
    }

    public Arbol(String nombre, String altoTallo, String tieneHojas, String climaIdeal, String variedad,
            String tipoTronco, String radioTrongo, String color, String tipoHojas) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTrongo = radioTrongo;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public String getRadioTrongo() {
        return radioTrongo;
    }

    public void setRadioTrongo(String radioTrongo) {
        this.radioTrongo = radioTrongo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }
    

    @Override
    public String toString() {
        return "Arbol [variedad=" + variedad + ", tipoTronco=" + tipoTronco + ", radioTrongo=" + radioTrongo
                + ", color=" + color + ", tipoHojas=" + tipoHojas + "]";
    }
    
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un árbol");
    }



}
