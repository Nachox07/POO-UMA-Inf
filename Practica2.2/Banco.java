/**
 * Created by Nacho González-Garilleti on 7/3/16.
 */
public class Banco {

    private final static int NCTAS = 10;
    private final static int NUMCTALIBRE = 1001;

    private String nombre;
    private int ppl;
    private int unca;

    private Cuenta [] cuentas;

    public Banco(String nombre, int i) {

        this.nombre = nombre;
        cuentas = new Cuenta[i];
        ppl = 0;
        unca = NUMCTALIBRE;

    }

    public Banco(String nombre) {

        this(nombre, NCTAS);

    }

    public int abrirCuenta(String titular, double saldo) {

        if(ppl == cuentas.length) {

            Cuenta [] cuentasNueva = new Cuenta[cuentas.length*2];

            System.arraycopy(cuentas, 0, cuentasNueva, 0, ppl);

            cuentas = cuentasNueva;

        }

        cuentas[ppl] = new Cuenta(titular, unca, saldo);
        ppl++;
        unca++;

        return unca-1;

    }

    public int abrirCuenta(String titular) {

        return abrirCuenta(titular, 0.0);

    }

    public void cerrarCuenta(int cuenta) {

        int pos = posicionCuenta(cuenta);

        for (int i = 0;i < ppl-1;i++) {
            cuentas[i] = cuentas[i+1];
        }

        cuentas[ppl-1] = null;
        ppl--;
        unca--;

    }

    private int posicionCuenta(int nc) {

        int pos = 0;

        while(pos < ppl && nc != cuentas[pos].numCuenta()) {
            pos++;
        }

        if(pos == ppl) {
            throw new RuntimeException("Cuenta inexistente " + pos);
        }

        return pos;

    }

    public void ingreso(int cuenta, double cantidad) {

        int pos = posicionCuenta(cuenta);

        cuentas[pos].ingreso(cantidad);

    }

    public double debito(int cuenta, double cantidad) {

        int pos = posicionCuenta(cuenta);

        double saldo = cuentas[pos].saldo();

        if(cantidad > saldo) {
            cantidad = saldo;
        }

        cuentas[pos].debito(cantidad);

        return cantidad;

    }

    public double saldo(int cuenta) {

        int pos = posicionCuenta(cuenta);

        return cuentas[pos].saldo();

    }

    public double transferencia(int cuenta1, int cuenta2, double cantidad) {

        int pos = posicionCuenta(cuenta1);
        double cant = debito(cuenta1, cuenta2);

        cuentas[pos].ingreso(cant);

        return cant;

    }

    public String toString() {

        String re = nombre + ": [";

        for (int i = 0;i < ppl;i++) {
            re += cuentas[i] + " ";
        }

        return re + "]";

    }

}
