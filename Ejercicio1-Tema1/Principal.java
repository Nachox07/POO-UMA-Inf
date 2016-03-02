/**
 * Ejercicio propuesto por el profesor donde proporcionó el código para responder a las siguientes preguntas.
 * 1. ¿Hay definidas variables de instancia en la clase punto? ¿Cuántas?
 * 2. ¿Hay definidas variables de clase en la clase Punto? ¿Cuántas?
 * 3. ¿Hay definidos métodos de instancia en la clase Punto? ¿Cuántos?
 * 4. ¿Hay definidos métodos de clase en la clase Punto? ¿Cuántos?
 * 5. ¿En cuántos ficheros fuente (.java) habría que escribir el código?
 * 6. ¿Cuál es la salida del programa?
 *
 * Solución:
 * 1. Sí, hay 2
 * 2. Sí, hay 1 (numPuntos)
 * 3. Sí, hay 7
 * 4. Sí, hay 1 (numPuntos();)
 * 5. Habría 2 ya que solo puede existir una clase pública por fichero (Punto.java, Principal.java)
 * 6.
 * Número puntos: 2
 * Distancia: 2.0
 * Número puntos: 2
 * Distancia: 0.0
 */
public class Principal {

    public static void main(String[] Args){

        Punto p = new Punto();
        Punto p2 = new Punto(0,0);

        System.out.println("Número puntos: " + Punto.numPuntos());
        System.out.println("Distancia: " + p.distanciaManhattan(p2));

        Punto p3 = p;

        System.out.println("Número puntos: " + Punto.numPuntos());
        System.out.println("Distancia: " + p.distanciaManhattan(p3));

    }

}
