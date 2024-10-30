package EjercicioIntegrador;

public class Arbusto extends Planta {
    
    private String anchoArbusto;
    private String esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private String sePodaOno;
    
    public Arbusto(){

    }

    public Arbusto(String nombre, String altoTallo, String tieneHojas, String climaIdeal, String anchoArbusto,
            String esDomestico, String variedadArbusto, String colorHojas, String sePodaOno) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePodaOno = sePodaOno;
    }


    public String getAnchoArbusto() {
        return anchoArbusto;
    }


    public void setAnchoArbusto(String anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }


    public String getEsDomestico() {
        return esDomestico;
    }


    public void setEsDomestico(String esDomestico) {
        this.esDomestico = esDomestico;
    }


    public String getVariedadArbusto() {
        return variedadArbusto;
    }


    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }


    public String getColorHojas() {
        return colorHojas;
    }


    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }


    public String getSePodaOno() {
        return sePodaOno;
    }


    public void setSePodaOno(String sePodaOno) {
        this.sePodaOno = sePodaOno;
    }

    @Override
    public String toString() {
        return "Arbusto [anchoArbusto=" + anchoArbusto + ", esDomestico=" + esDomestico + ", variedadArbusto="
                + variedadArbusto + ", colorHojas=" + colorHojas + ", sePodaOno=" + sePodaOno + "]";
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un arbusto");
    }



}
