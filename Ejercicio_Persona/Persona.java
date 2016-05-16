/**
 * Created by Nacho González-Garilleti on 31/3/16.
 */
public class Persona {

    private String nombre, dni, email, direccion;
    private int edad;

    public Persona(String nombre, String dni, String email, String direccion, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.direccion = direccion;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String toString() {
        String s = dni+" : "+nombre+", "+edad+" años";

        return s;
    }

}
