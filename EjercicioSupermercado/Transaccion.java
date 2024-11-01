

public class Transaccion {
    private Producto producto;

    public Transaccion(Producto producto){
        this.producto = producto;
    }

    public double pagoProducto(){
        double precioProducto = producto.getPrecioProducto();
        int cantidadProducto = producto.getCantidadProducto();
        double precioTransaccion = precioProducto*cantidadProducto;
        return precioTransaccion;
    }
    
    public void infoTransaccion(){
        String nombreProducto = producto.getNombreProducto();
        System.out.println("Producto: "+nombreProducto+" Precio por unidad: "+producto.getPrecioProducto()+"$"+" |Cantidad: "+producto.getCantidadProducto());
    }




}
