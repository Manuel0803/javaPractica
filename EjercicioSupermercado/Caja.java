public class Caja {
   
    private Empleado empleado;
    private int nroCaja;

    public Caja(Empleado empleado, int nroCaja) {
        this.empleado = empleado;
        this.nroCaja = nroCaja;
    }

    


    public Empleado getEmpleado() {
        return empleado;
    }




    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }




    public int getNroCaja() {
        return nroCaja;
    }




    public void setNroCaja(int nroCaja) {
        this.nroCaja = nroCaja;
    }




    @Override
    public String toString() {
        return this.empleado.toString() + "\nNro de caja: " + this.nroCaja;
    }

    



}
