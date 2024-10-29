package EjercicioVideojuegos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    

    //Creacion de Array y creacion de juegos.
    ArrayList<Videojuego> Juegos = new ArrayList<>();
    Videojuego juego1 = new Videojuego(10, "Resident Evil", "PS5", 2);
    Videojuego juego2 = new Videojuego(11, "Sonic", "Sega", 2);
    Videojuego juego3 = new Videojuego(12, "GTA San Andreas", "PC", 1);
    Videojuego juego4 = new Videojuego(13, "FIFA 2025", "PS5", 2);
    Videojuego juego5 = new Videojuego(14, "Worms", "PS2", 2);
    
    //Añadiendo juegos al array.
    Juegos.add(juego1);
    Juegos.add(juego2);
    Juegos.add(juego3);
    Juegos.add(juego4);
    Juegos.add(juego5);

    //Recorriendo Array
    for (Videojuego listaJuego : Juegos) {
        System.out.println("El juego: " + listaJuego.getTitulo() + " se puede jugar en  " +  listaJuego.getConsola() + " y puede contener hasta " + listaJuego.getCantidadJugadores() + " cantidad de jugadores " );
    }

    //cambiando con setter el titulo y cantidad de jugadores.
    juego1.setTitulo("Buscaminas");
    juego2.setTitulo("MarioBros");
    juego1.setCantidadJugadores(1);
    juego2.setCantidadJugadores(1);

    System.out.println("--------------");

    //for each despues del cambio.
    for (Videojuego listaJuego : Juegos) {
        System.out.println("El juego: " + listaJuego.getTitulo() + " se puede jugar en  " + listaJuego.getConsola() + " y puede contener hasta " + listaJuego.getCantidadJugadores() + " cantidad de jugadores " );
    }

    System.out.println("-----------------------");
    //Listar videojuegos que son de la PS5 unicamente.
    for (Videojuego listaJuego : Juegos) {

        if (listaJuego.getConsola().equals("PS5")) {
            System.out.println("Los juegos que se pueden jugar en PS5 son: " + listaJuego.getTitulo());
        }
        
    }

    }
}
