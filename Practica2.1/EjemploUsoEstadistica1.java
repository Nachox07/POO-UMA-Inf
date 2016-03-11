/**
 * Created by Nacho González-Garilleti on 7/3/16.
 */
public class EjemploUsoEstadistica1 {

    public static void main(String[] a) {
        Estadistica est = new Estadistica();
        est.agrega(4);
        est.agrega(6);
        est.agrega(5);
        est.agrega(7);

        System.out.println("La media es "+est.getMedia());
    }

}
