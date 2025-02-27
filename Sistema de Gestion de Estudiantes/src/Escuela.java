import java.util.ArrayList;

public class Escuela {

    String nombre_escuela;
    ArrayList <Curso> cursos = new ArrayList<>();

    public void agregar_cursos(Curso curso){
        cursos.add(curso);
    }

    public void mostrar_cursos(){
        for (Curso curso : cursos) {
            System.out.println("El nombre del curso es: " + curso.getNombre_curso());
        }
    }

}
