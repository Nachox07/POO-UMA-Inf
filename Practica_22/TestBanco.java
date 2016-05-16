/**
 * @author Nacho González-Garilleti
 */
public class TestBanco {

    public static void main(String[] a) {

        Banco b = new Banco("TubbiesBank", 5);

        int nJohn = b.abrirCuenta("John", 500);
        int nJane = b.abrirCuenta("Jane", 500);
        int nBaby = b.abrirCuenta("Baby", 500);
        int nTest = b.abrirCuenta("Test", 500);
        int nTest2 = b.abrirCuenta("Test2");

        System.out.println(b);

        b.ingreso(nJohn, 100);
        b.ingreso(nTest2, 300);
        b.debito(nJane, 100);
        b.transferencia(nBaby, nTest, 100);

        System.out.println(b);

        b.cerrarCuenta(nTest2);
        b.cerrarCuenta(nJohn);
        b.ingreso(nJane,200);

        System.out.println(b);

    }

}
