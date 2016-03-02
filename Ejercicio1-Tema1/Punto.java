public class Punto {

    private double x,y;
    private static int numPuntos = 0;

    public static int numPuntos(){

        return numPuntos;

    }

    public Punto(){

        x = 1;
        y = 1;

        numPuntos++;

    }

    public Punto(double x, double y){

        this.x = x;
        this.y = y;

        numPuntos++;

    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(){
        this.y = y;
    }

    public double distanciaManhattan(Punto p){

        double difX, difY;

        difX = getX() - p.getX();
        difY = this.getY() - p.getY();

        return Math.abs(difX) + Math.abs(difY);

    }

}