/**
 * Created by Nacho Gonzalez-Garilleti on 22/2/16.
 */
public class Example {

    public static void main(String[] args){

        sumaTodo objeto = new sumaTodo();
        sumaTodo objeto2 = new sumaTodo();

        for(int i = 0;i <= 100;i++){

            objeto.empieza();

        }

        for(int i = 0;i <= 100;i++){

            // Al ser estatica la variable suma, se mantiene su valor a lo largo de la creacion
            // de nuevos objetos

            objeto2.empieza();

        }

    }

}

class sumaTodo{

    private static int suma = 0;

    public static void empieza(){

        suma++;
        System.out.println(suma);

    }

}
