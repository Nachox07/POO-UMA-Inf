/**
 * @author Nacho González-Garilleti
 */
public class Circulo{

    private double radio;
    private Punto centro;

    public Circulo(){

        this(new Punto(), 0);

    }

    public Circulo(Punto punto, double radio){

        this.radio = radio;
        centro = punto;

    }

    public Punto centro(){

        return centro;

    }

    public double radio(){

        return radio;

    }

    public void centro(Punto punto){

        centro = punto;

    }

    public void radio(double radio){

        this.radio = radio;

    }

    public void trasladar(double a, double b){

        this.centro().trasladar(a,b);

    }

    public String toString(){

        return ("Circulo(" + centro + ", " + radio + ")");

    }

}