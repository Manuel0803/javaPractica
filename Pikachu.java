public class Pikachu extends Pokemon implements Electrico{

    public Pikachu() {
    }

    public Pikachu(String nombre_pokemon, int num_pokedex, double peso, int temporada) {
        super(nombre_pokemon, num_pokedex, peso, temporada);
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println(getNombre_pokemon()+ " realizó un Impractrueno.");
    }

    @Override
    public void atacarRayo() {
        System.out.println(getNombre_pokemon()+ " ataco con rayo.");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println(getNombre_pokemon()+ " utilizó puño trueno.");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println(getNombre_pokemon()+ " utilizo su rayo Carga.");
    }

    @Override
    public void Placaje() {
        System.out.println(getNombre_pokemon()+ " se puso su placaje.");
    }

    @Override
    public void Mordisco() {
        System.out.println(getNombre_pokemon()+ " dio un mordisco.");
    }

    @Override
    public void Araniazo() {
        System.out.println(getNombre_pokemon()+ " dio un arañazo.");
    }

    

}