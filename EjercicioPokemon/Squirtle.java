public class Squirtle extends Pokemon implements Planta{

    public Squirtle() {
    }

    public Squirtle(String nombre_pokemon, int num_pokedex, double peso, int temporada) {
        super(nombre_pokemon, num_pokedex, peso, temporada);
    }

    @Override
    public void Placaje() {
        System.out.println(getNombre_pokemon()+ " uso placaje.");
    }

    @Override
    public void Araniazo() {
        System.out.println(getNombre_pokemon()+ " tiro un arañazo");
    }

    @Override
    public void Mordisco() {
        System.out.println(getNombre_pokemon()+ " dio un mordisco.");
    }

    @Override
    public void atacarParalizar() {
        System.out.println(getNombre_pokemon()+ " paralizo.");
    }

    @Override
    public void AtacarDrenaje() {
        System.out.println(getNombre_pokemon()+ " uso drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println(getNombre_pokemon()+ " uso su hoja afilada.");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println(getNombre_pokemon()+ " ataco con su latigo cepa.");
    }




}