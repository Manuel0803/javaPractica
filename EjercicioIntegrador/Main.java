package EjercicioIntegrador;

public class Main {
    public static void main(String[] args) {
        


        Arbol arbol1 = new Arbol("Lapacho", "10 Metros", "Si", "Primavera", "1", "Duro", "Marron Oscuro", "2 Metros", "Oscuras");
        arbol1.decirLoQueSoy();
        System.out.println(arbol1.toString());

        System.out.println("--------");

        Flor flor1 = new Flor("Hoja de arce", "2 Centimetros", "Si", "Otoño", "Verde", "10", "Amarillo", "Rara", "Principio de otoño");
        flor1.decirLoQueSoy();
        System.out.println(flor1.toString());

        System.out.println("--------");

        Arbusto arbusto1 = new Arbusto("Arbuston", "10 Centimetros", "Si", "Verano", "2 metros", "Si", "Variedad rara", "Verde Oscuro", "Si");
        arbusto1.decirLoQueSoy();
        System.out.println(arbusto1.toString());

    }
}
