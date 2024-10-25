public class Charmander extends Pokemon implements Fuego{

    public Charmander() {
    }

    public Charmander(String nombre_pokemon, int num_pokedex, double peso, int temporada) {
        super(nombre_pokemon, num_pokedex, peso, temporada);
    }

    @Override
    public void Placaje() {
        System.out.println(getNombre_pokemon()+ " usa placaje.");
    }

    @Override
    public void Araniazo() {
        System.out.println(getNombre_pokemon()+ " usa arañazo.");
    }

    @Override
    public void Mordisco() {
        System.out.println(getNombre_pokemon()+ " da un mordisco.");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println(getNombre_pokemon()+ " utiliza su puño de fuego.");
    }

    @Override
    public void atacarAscuas() {
        System.out.println(getNombre_pokemon()+ " ataca con ascuas.");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println(getNombre_pokemon()+ " utiliza su lanzallamas.");
    }

    




}
