package EjercicioTienda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList<>();

        Tienda tienda = new Tienda(clientes);
        tienda.menu();

        
        
        }
}

