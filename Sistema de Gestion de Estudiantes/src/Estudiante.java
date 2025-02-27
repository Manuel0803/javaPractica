import java.lang.reflect.Array;
import java.util.ArrayList;

public class Estudiante {

    int dni;
    String nombre;
    ArrayList<Double> lista_notas = new ArrayList<>();

    public Estudiante() {
    }

    public Estudiante(int dni, String nombre, ArrayList<Double> lista_notas) {
        this.dni = dni;
        this.nombre = nombre;
        this.lista_notas = lista_notas;
    }

    public void agregarNota(double nota){
        lista_notas.add(nota);
    }

    public Double calcularPromedio(){
        double total = 0;
        int cantidadNotas = lista_notas.size();

        for (Double listaNota : lista_notas) {
            total += listaNota;
        }

        double promedio = total / cantidadNotas;
        return promedio;
    }

    public void mostrarDatos(){
        System.out.println("|----DATOS DEL ESTUDIANTE----|");
        System.out.println("Los datos del estudiante son Nombre: " + getNombre() + "DNI: " + getDni() + "y su promedio es de:" + calcularPromedio());

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getLista_notas() {
        return lista_notas;
    }

    public void setLista_notas(ArrayList<Double> lista_notas) {
        this.lista_notas = lista_notas;
    }
}






