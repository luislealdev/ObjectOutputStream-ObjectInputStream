import java.io.Serializable;

public class Alumno implements Serializable {
    String a_nombre;
    Double a_calif;

    Alumno(String p_nombre, Double p_calif) {
        a_nombre = p_nombre;
        a_calif = p_calif;
    }

    public void m_mostrar() {
        System.out.println("Nombre: " + a_nombre + "\nCalificación: " + a_calif);
    }
}
