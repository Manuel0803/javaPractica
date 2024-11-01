public class Producto {
    
    private String nombreProducto;
    private double precioProducto;
    private int cantidadProducto;
    
    public Producto() {
    }

    public Producto(String nombreProducto, double precioProducto, int cantidadProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "Producto [nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto
                + ", cantidadProducto=" + cantidadProducto + "]";
    }



}
