/**
 * @author Nacho González-Garilleti
 */
public class Punto {

    private double x;
    private double y;

    public Punto(){

        this(0,0);

    }

    public Punto(double x, double y){

        this.x = x;
        this.y = y;

    }

    public double abscisa(){

        return x;

    }

    public double ordenada(){

        return y;

    }

    public double distancia(Punto p){

        double res = Math.sqrt(Math.pow((p.abscisa() - this.abscisa()),2) + Math.pow((p.ordenada() - this.ordenada()),2));
        return res;

    }

    public void abcisa(double x){

        this.x = x;

    }

    public void ordenada(double y){

        this.y = y;

    }

    public void trasladar(double cx, double cy){

        x = x +cx;
        y = y + cy;

    }

    public String toString(){

        return ("(" + abscisa() + ", " + ordenada() + ")");

    }
}