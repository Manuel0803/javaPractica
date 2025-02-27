import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    String nombre_curso;
    ArrayList <Estudiante> lista_estudiantes = new ArrayList<>();

    public void inscribir_estudiante(Estudiante estudiante){
        lista_estudiantes.add(estudiante);
    }

    public void mostrar_estudiantes(){
        System.out.println("---- Estudiantes del curso" + getNombre_curso() + "----");
        for (Estudiante listaEstudiante : lista_estudiantes) {
            listaEstudiante.mostrarDatos();
        }
    }

    public void mostrar_promedios(){
        System.out.println("-- Los promedios de los estudiantes -- ");
        for (Estudiante listaEstudiante : lista_estudiantes) {
            String alumnmo = listaEstudiante.getNombre();
            System.out.println("El alumno: " + "tiene un promedio de: " + listaEstudiante.calcularPromedio());
        }
    }

    public void obtener_mejor_estudiante(){
        double mayorPromedio = 0;
        Estudiante mejorEstudiante = null;
        for (Estudiante listaEstudiante : lista_estudiantes) {
            if (listaEstudiante.calcularPromedio() > mayorPromedio) {
                mayorPromedio = listaEstudiante.calcularPromedio();
                mejorEstudiante = listaEstudiante;
            }
            
        }
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public ArrayList<Estudiante> getLista_estudiantes() {
        return lista_estudiantes;
    }

    public void setLista_estudiantes(ArrayList<Estudiante> lista_estudiantes) {
        this.lista_estudiantes = lista_estudiantes;
    }
}
