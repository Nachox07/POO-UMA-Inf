/**
 * @author Nacho González-Garilleti
 */
public class EjemploUsoEstadistica2 {

    public static void main(String[] a) {

        Estadistica est = new Estadistica();
        java.util.Random ran = new java.util.Random();

        for (int i = 0; i < 100000 ; i++) {
            est.agrega(ran.nextGaussian());
        }

        System.out.println("Media = "+est.getMedia());
        System.out.println("Desviación típica = "+est.getDesviacionTipica());
    }

}
