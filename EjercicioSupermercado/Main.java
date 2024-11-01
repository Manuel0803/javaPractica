import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado empleado = new Empleado(25000, "Juarez", 44953245, "Cacho");


        System.out.println("~----------~SUPERMERCADO: VEA~----------~");
        System.out.println("~--------------~BIENVENIDO~--------------~");
        System.out.println("~--------------~OPRIMA ENTER~--------------~");
        sc.nextLine();
        System.out.println("Ingrese su nombre de cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese su DNI sin puntos ni guiones.");
        int dni = sc.nextInt();

        System.out.println("- - - - Es usted un/a cliente mayorista? - - - - -");
        System.out.println("  - -   | Si: 1 | No: 0 | Info. C.Mayoristas: 2 |    - - ");

        boolean bandera1 = true;
        boolean mayorista = true;

        while(bandera1){
            int numIngresado = sc.nextInt();
            sc.nextLine();
            switch (numIngresado) {
                case 1:
                    mayorista = true;
                    bandera1 = false;
                    break;
                case 0:
                    mayorista = false;
                    bandera1 = false;
                    break;
                case 2:
                    System.out.println("Si sos un cliente mayorista");
                    System.out.println("Se otorga un 25% de descuento en el monto total a pagar\n");
                    System.out.println("- - - - Es usted un/a cliente mayorista? - - - - -");
                    System.out.println("  - -   | Si: 1 | No: 0 | Info. C.Mayoristas: 2 |    - - ");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    System.out.println("- - - - Es usted un/a cliente mayorista? - - - - -");
                    System.out.println("  - -   | Si: 1 | No: 0 | Info. C.Mayoristas: 2 |    - - ");
                    break;
            }
        }

        Cliente cliente1 = new Cliente(mayorista, apellido, dni, nombre);
        System.out.println("--Información de cliente actualizada--");
        System.out.println(cliente1);
        System.out.println(" - - - - - - - - - - - - - - - - - - - -");
        System.out.println("-Presione ENTER para continuar");
        sc.nextLine();

        boolean bandera2 = true;
        
        ArrayList<Transaccion> Facturas = new ArrayList<>();
        double totalPago = 0;

        while (bandera2){
            System.out.println("Ingrese el nombre del producto a comprar:");
            String nombreProducto = sc.nextLine();
            System.out.println("Ingrese el valor del producto: ");
            double precioProducto = sc.nextDouble();
            System.out.println("Ingrese la cantidad del producto a comprar: ");
            int cantidadProducto = sc.nextInt();

            Producto producto = new Producto(nombreProducto, precioProducto, cantidadProducto);
            Transaccion transaccionNueva = new Transaccion(producto);
            double pagoTransaccion = transaccionNueva.pagoProducto();

            totalPago = totalPago + pagoTransaccion;
            Facturas.add(transaccionNueva);

            System.out.println("\n-----------------------");
            System.out.println("Monto acumulado hasta el momento: "+ totalPago +"$");
            System.out.println("-----------------------");
            System.out.println("¿Quiere ingresar otro producto? ");
            System.out.println(" ---    Si: 1 - No: 0   --- ");
            
            int numIngresado = sc.nextInt();
            sc.nextLine();

            if (numIngresado == 1){
                System.out.println("Ingresando producto nuevo:" );
                sc.nextLine();
            }else if(numIngresado == 0){
                bandera2 = false;
            }else {
                System.out.println("Estas ingresando un numero no valido.");
            }
        }

        Caja caja1 = new Caja(empleado, 1);
        System.out.println("FACTURA GENERADA");
        System.out.println("Caja nro: ["+caja1.getNroCaja()+"]");
        System.out.println("Empleado a cargo: " + empleado);
        System.out.println("Articulos en el carrito: ");
        for (Transaccion transaccion : Facturas) {
            transaccion.infoTransaccion();
        }

        System.out.println("--------------------");

        if (cliente1.isMayorista()){
            double descuento = (totalPago*25)/100;
            totalPago = totalPago - descuento;
            System.out.println("Cliente: "+ cliente1.getNombre() + cliente1.getApellido());
            System.out.println("Monto a abonar: " + totalPago);
            System.out.println("PRESIONE ENTER PARA PAGAR");
            sc.nextLine();
        }else {
            System.out.println("Cliente: "+ cliente1.getNombre() + cliente1.getApellido());
            System.out.println("Monto a abonar: " + totalPago);
            System.out.println("PRESIONE ENTER PARA PAGAR");
            sc.nextLine();
        }

        sc.close();
    } 

}
