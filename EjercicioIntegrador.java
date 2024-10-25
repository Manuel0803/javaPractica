public class EjercicioIntegrador {
    public static void main(String[] args) {
        
        Pikachu pokeRayo = new Pikachu("Chukapi", 120, 95, 4);
        pokeRayo.Araniazo();
        pokeRayo.atacarImpactrueno();
        pokeRayo.atacarPunioTrueno();
        pokeRayo.atacarRayo();
        pokeRayo.atacarRayoCarga();
        System.out.println("------------------------------------------------------------------------------");

        Bulbasaur pokeAgua = new Bulbasaur("Bombucha", 47, 40, 10);
        pokeAgua.Araniazo();
        pokeAgua.atacarBurbuja();
        pokeAgua.atacarHidrobomba();
        pokeAgua.atacarHidropulso();
        pokeAgua.atacarPistolaAgua();
        System.out.println("------------------------------------------------------------------------------");


        Squirtle pokePlanta = new Squirtle("Semillon", 100, 150, 7);
        pokePlanta.Araniazo();
        pokePlanta.AtacarDrenaje();
        pokePlanta.atacarHojaAfilada();
        pokePlanta.atacarLatigoCepa();
        pokePlanta.atacarParalizar();
        System.out.println("------------------------------------------------------------------------------");


        Charmander pokeFuego = new Charmander("Fogon", 1, 50, 9);
        pokeFuego.Araniazo();
        pokeFuego.atacarAscuas();
        pokeFuego.atacarLanzallamas();
        pokeFuego.atacarPunioFuego();
        System.out.println("------------------------------------------------------------------------------");


    }
}
