/**
 * @author Nacho González-Garilleti
 */
public class EjemploUsoJarras1 {

    public static void main(String[] a) {

        Jarra jarraA = new Jarra(7);
        Jarra jarraB = new Jarra(4);

        jarraA.llenarJarra();
        jarraB.llenarJarra();

        System.out.println(jarraA);
        System.out.println(jarraB);

        jarraA.llenarDesde(jarraB);

        System.out.println(jarraA);
        System.out.println(jarraB);

        jarraB.vaciarJarra();

        System.out.println(jarraA);
        System.out.println(jarraB);

        jarraA.llenarDesde(jarraB);

        System.out.println(jarraA);
        System.out.println(jarraB);

    }

}
