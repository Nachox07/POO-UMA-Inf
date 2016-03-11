/**
 * Created by Nacho González-Garilleti on 7/3/16.
 */
public class Jarra {

    private int cantidad;
    private final int capacidad;

    public Jarra(int capacidad) {

        cantidad = 0;
        this.capacidad = capacidad;

    }

    public int getCapacidad() {
        return cantidad;
    }

    public int getCantidad() {
        return capacidad;
    }

    public void llenarJarra() {
        cantidad = capacidad;
    }

    public void vaciarJarra() {
        cantidad = 0;
    }

    public void llenarDesde(Jarra j) {

        int tmp = Math.min(capacidad-cantidad,j.cantidad);

        cantidad = tmp;
        j.cantidad -= tmp;

    }

    public String toString() {

        return "Jarra ("+this.capacidad+","+this.cantidad+")";

    }

}
