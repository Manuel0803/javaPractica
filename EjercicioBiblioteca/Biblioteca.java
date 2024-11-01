package EjercicioBiblioteca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Biblioteca {
Scanner sc = new Scanner(System.in);

private int opcion;
private int indice;
private String libroBuscado;

    //constructor biblioteca.
    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }


    //creación del array libros.
    ArrayList<Libro> libros = new ArrayList<>();

    //metodo para agregar libro
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }


    //metodo para buscar libros.
    public void buscarLibro(String libroBuscado){
        if(libros.isEmpty()) {
			System.out.println("No hay libros para buscar");
            return;
		}
        boolean encontrado = false;
        for (Libro lib : libros) {
            if (lib.getNombre().equalsIgnoreCase(libroBuscado)){
                encontrado = true;
                System.out.println("El libro encontrado fue: ");
               System.out.println(lib);

            }

        }
        if (!encontrado){
            System.out.println("No se encontro el libro.");
        }
    }


    //metodo para quitar libros.
    public void quitarLibro(int libro){
        if(libros.isEmpty()) {
			System.out.println("No hay libros para eliminar");
            return;
        }
        libros.remove(libro);
    }


    //metodo para listar libros
    public void listarLibros(){
        for (Libro lib : libros) {
            System.out.println(lib.toString());
        }
    }
    

    //metodo para ordenar libros alfabeticamente
    public void ordenarLibros() {
    Collections.sort(libros, (Libro libro1, Libro libro2) -> libro1.getNombre().compareToIgnoreCase(libro2.getNombre()));
    System.out.println("Los libros han sido ordenados alfabéticamente.");
}


    //metodo para editar libro segun su indice
    public void editarLibro(int index, Libro nuevoLibro) {
        if (index >= 0 && index < libros.size()){
        libros.set(index, nuevoLibro);
        }else {
            System.out.println("Índice no válido. No se puede editar el libro.");
        }
    }
    
    boolean bandera1 = true;
    public void menu(){
        while (bandera1){
            
            System.out.println("\n--- Menú de Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Editar libro");
            System.out.println("4. Buscar libro");
            System.out.println("5. Quitar libro");
            System.out.println("6. Ordenar y listar libros");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    Libro libro1 = new Libro();
                    System.out.println("Ingrese nombre de libro:");
                    libro1.setNombre(sc.nextLine());
                    System.out.println("Ingrese el nombre del autor:");
                    libro1.setAutor(sc.nextLine());
                    System.out.println("Ingrese el ISBN:");
                    libro1.setIsbn(sc.nextLine());
                    agregarLibro(libro1);
                    System.out.println("Libro agregado exitosamente.");
                    break;


                case 2:
                    System.out.println("Listando libros");
                    listarLibros();
                    break;


                case 3:
                    Libro libro2 = new Libro();
                    System.out.println("Ingrese el indice que quiere reemplazar.");
                    indice = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese nombre de libro para reemplazar:");
                    libro2.setNombre(sc.nextLine());
                    System.out.println("Ingrese el nombre del autor:");
                    libro2.setAutor(sc.nextLine());
                    System.out.println("Ingrese el ISBN:");
                    libro2.setIsbn(sc.nextLine());
                    editarLibro(indice, libro2);
                    break;


                case 4:
                    System.out.println("Ingrese el nombre del libro a buscar:");
                    libroBuscado = sc.nextLine();
                    buscarLibro(libroBuscado);
                    break;


                case 5:
                    System.out.println("Ingrese el indice del libro a ser removido:");
                    quitarLibro(sc.nextInt());
                    System.out.println("El libro fue removido exitosamente.");
                    break;

//arreglar el case 6
                case 6:
                    ordenarLibros();
                    break;  


                case 0:
                    System.out.println("Saliendo del programa.");
                    bandera1 = false;
                    break;


                default:
                    System.out.println("Opción no válida. Por favor, elige otra.");
                    break;


            }

        } 
        sc.close();

    }



}







