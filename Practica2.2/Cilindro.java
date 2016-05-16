/**
 * @author Nacho González-Garilleti
 */
public class Cilindro{

    private Circulo base;
    private double altura;

    public Cilindro(){

        base = new Circulo();
        altura = 0.0;

    }

    public Cilindro(Circulo base, double altura){

        this.base = base;
        this.altura = altura;

    }

    public Circulo base(){

        return base;

    }

    public double altura(){

        return altura;

    }

    public void base(Circulo base){

        this.base = base;

    }

    public void altura(double altura){

        this.altura = altura;

    }

    public void trasladar(double x, double y){

        this.base().trasladar(x,y);

    }

    public String toString(){

        return ("Cilindro(" + this.base() + ", " + altura+")");

    }

}
