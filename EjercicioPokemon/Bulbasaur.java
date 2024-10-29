public class Bulbasaur extends Pokemon implements Agua {

    public Bulbasaur() {
    }

    public Bulbasaur(String nombre_pokemon, int num_pokedex, double peso, int temporada) {
        super(nombre_pokemon, num_pokedex, peso, temporada);
    }

    @Override
    public void Placaje() {
        System.out.println(getNombre_pokemon()+ " utiliza placaje");
    }

    @Override
    public void Araniazo() {
        System.out.println(getNombre_pokemon()+ " utiliza arañazo");
    }

    @Override
    public void Mordisco() {
        System.out.println(getNombre_pokemon()+ " ha usado su mordisco.");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println(getNombre_pokemon()+ " ataca con hidrobomba.");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println(getNombre_pokemon()+ " usa su pistola de agua.");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println(getNombre_pokemon()+ " ha atacado con burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println(getNombre_pokemon()+ " ataca con hidropulso.");
    }
    
    


}
