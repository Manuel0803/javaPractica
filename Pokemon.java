public abstract class Pokemon {
    
    private int num_pokedex;
    private String nombre_pokemon;
    private double peso;
    private int temporada;

    public Pokemon() {


    }

    public Pokemon(String nombre_pokemon, int num_pokedex, double peso, int temporada) {
        this.nombre_pokemon = nombre_pokemon;
        this.num_pokedex = num_pokedex;
        this.peso = peso;
        this.temporada = temporada;
    }

    public abstract void Placaje();
    public abstract void Araniazo();
    public abstract void Mordisco();

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public String getNombre_pokemon() {
        return nombre_pokemon;
    }

    public void setNombre_pokemon(String nombre_pokemon) {
        this.nombre_pokemon = nombre_pokemon;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    




}
