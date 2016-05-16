/**
 * @author Nacho González-Garilleti
 */
public class EjemploUsoJarras2 {

    public static void main(String[] a) {

        Jarra jarraA = new Jarra(7);
        Jarra jarraB = new Jarra(5);

        jarraB.llenarJarra();
        jarraA.llenarDesde(jarraB);

        jarraB.llenarJarra();
        jarraA.llenarDesde(jarraB);

        jarraA.vaciarJarra();
        jarraA.llenarDesde(jarraB);

        jarraB.llenarJarra();
        jarraA.llenarDesde(jarraB);

        System.out.println(jarraA);
        System.out.println(jarraB);

    }

}
