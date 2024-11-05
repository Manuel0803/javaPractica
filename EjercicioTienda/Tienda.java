package EjercicioTienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    
    ArrayList<Cliente> clientes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    boolean bandera1 = true;

    public Tienda() {
    }

    public Tienda(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente buscarCliente(int id) {
        for (Cliente clientito : clientes) {
            if (id == clientito.getIdCliente()) {
                return clientito;
            }
        }
        return null;    
    }
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void actualizarDatos(int id, String nombre, String correo, String numTelefono) {
        Cliente cliente = buscarCliente(id);

        if (cliente != null) {
            cliente.setCorreo(correo);
            cliente.setNombre(nombre);
            cliente.setNumTelefono(numTelefono);
        } else {
            System.out.println("No se encontró el cliente");
        }
    }

    public void eliminarCliente(int id) {
        Cliente cliente = buscarCliente(id);

        if (cliente != null) {
            clientes.remove(cliente);
        } else {
            System.out.println("No se encontró ningún cliente.");
        }
    }

    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Lista de clientes registrados:");
            for (Cliente cli : clientes) {
                System.out.println(cli.toString());
            }
        }
    }

    public void menu() {
        System.out.println("- - - - - BIENVENIDO A LA TIENDA RYR - - - - -");
        System.out.println("- - - - - PARA CONTINUAR OPRIMA ENTER - - - - -");
        sc.nextLine();
        
        while (bandera1) {
            System.out.println("1: -AGREGAR CLIENTE-");
            System.out.println("2: -ELIMINAR CLIENTE-");
            System.out.println("3: -MOSTRAR CLIENTES-");
            System.out.println("4: -BUSCAR CLIENTE-");
            System.out.println("5: -ACTUALIZAR DATOS-");
            System.out.println("\n-PULSE 6 PARA SALIR-");
            
            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese su correo: ");
                    String correo = sc.nextLine();
                    System.out.println("Ingrese su número de teléfono: ");
                    String numTelefono = sc.nextLine();
                    System.out.println("Ingrese su id de cliente: ");
                    int idCliente = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea
                    
                    Cliente cliente = new Cliente(nombre, correo, numTelefono, idCliente);
                    agregarCliente(cliente);
                    System.out.println("Cliente agregado exitosamente.");
                    break;

                case 2:
                    System.out.println("Ingrese la id del cliente a eliminar: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea
                    eliminarCliente(id);
                    break;

                case 3:
                    mostrarClientes();
                    break;

                case 4:
                    System.out.println("Ingrese la id del cliente a buscar: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea
                    Cliente clienteBuscado = buscarCliente(idBuscar);
                    if (clienteBuscado != null) {
                        System.out.println(clienteBuscado.toString());
                    } else {
                        System.out.println("No se encontró el cliente.");
                    }
                    break;

                case 5:
                    System.out.println("Ingrese la id del cliente a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea
                    System.out.println("Ingrese el nombre del cliente a actualizar: ");
                    String nombreActualizar = sc.nextLine();
                    System.out.println("Ingrese el correo del cliente a actualizar: ");
                    String correoActualizar = sc.nextLine();
                    System.out.println("Ingrese el número de teléfono del cliente a actualizar: ");
                    String numTelefonoActualizar = sc.nextLine();
                    actualizarDatos(idActualizar, nombreActualizar, correoActualizar, numTelefonoActualizar);
                    System.out.println("Datos actualizados correctamente.");
                    break;

                case 6:
                    bandera1 = false;
                    System.out.println("Saliendo del sistema. ¡Gracias por usar Tienda RYR!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
