/**
 * @author Nacho González-Garilleti
 */
public class Estadistica {

    private static double numElementos;
    private static double sumaX;
    private static double sumaX2;

    public void agrega(double d) {

        numElementos++;
        sumaX += d;
        sumaX2 += d*d;

    }

    public void agrega(double d, int n) {

        for (int i = 0; i <= n; i++) {
            numElementos++;
            sumaX += d;
            sumaX2 += d*d;
        }

    }

    public double getMedia() {
        return sumaX/numElementos;
    }

    public double getVarianza() {
        return sumaX2/numElementos - (getMedia()*getMedia());
    }

    public double getDesviacionTipica() {
        return Math.sqrt(getVarianza());
    }

}
