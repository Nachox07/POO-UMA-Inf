/**
 * Created by Nacho González-Garilleti on 7/3/16.
 */
public class Cuenta{

    private int numero;
    private double saldo;
    private String titular;

    public Cuenta(String titular, int numero, double saldo) {

        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;

    }

    public Cuenta(String titular, int numero) {

        this(titular, numero, 0);

    }

    public void ingreso(double cantidad) {

        saldo += cantidad;

    }

    public void debito(double cantidad) {

        saldo -= cantidad;

    }

    public String titular() {

        return titular;

    }

    public double saldo() {

        return saldo;

    }

    public int numCuenta() {

        return numero;

    }

    public String toString() {
        return "Nombre: "+titular+"\nNumero: "+numero+"\nSaldo: "+saldo;
    }

}
